package com.GrandCircus.controller;

;
import com.GrandCircus.Customer;
import com.models.CafeInventoryEntity;
import com.models.CustomersEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;


@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView welcome() {
        return new ModelAndView("welcome", "", "");
    }

    @RequestMapping(value = "/customer", method = RequestMethod.GET)
    public ModelAndView customer(@RequestParam("name") String name, @RequestParam("email") String email) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session session = sessionFact.openSession();
        Transaction tx = session.beginTransaction();
        CustomersEntity newCust = new CustomersEntity();
        newCust.setName(name);
        newCust.setEmail(email);
        return new ModelAndView("customer", "command", new Customer());
    }

//    @RequestMapping(value="/addCustomer", method=RequestMethod.POST)
//    public String addCustomer(Customer customer, Model model){
//       model.addAttribute("name", customer.getName());
//        model.addAttribute("email", customer.getEmail());
//        model.addAttribute("phone", customer.getPhone());
//        return "result";
//    }

    @RequestMapping(value = "/customerGreeting", method = RequestMethod.POST)
    public String customerGreeting(Customer customer, Model model) {
        model.addAttribute("name", customer.getName());
        return "customerGreeting";
    }

    @RequestMapping(value = "/homePage", method = RequestMethod.GET)
    public ModelAndView homePage() {
        return new ModelAndView("homePage", "", "");
    }

//    @RequestMapping(value = "/menu", method = RequestMethod.GET)
//    public ModelAndView menu() {
//        return new ModelAndView("menu", "", "");
//
//    }

    @RequestMapping(value = "/locationTester", method = RequestMethod.GET)
    public ModelAndView location() {
        return new ModelAndView("location", "", "");

    }

    //HIBERNATE STUFF, PER INSTRUCTIONS
//    @RequestMapping("listCustomers")
//    public ModelAndView listCustomer() {
//        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sessionFact = cfg.buildSessionFactory();
//        Session selectCustomers = sessionFact.openSession();
//        selectCustomers.beginTransaction();
//        Criteria c = selectCustomers.createCriteria(CustomersEntity.class);
//        ArrayList<CustomersEntity> customerList = (ArrayList<CustomersEntity>) c.list();
//        return newModelAndView("welcome2", "cList", customerList);
//    }

    @RequestMapping(value="/admin", method=RequestMethod.GET)
    public String admin(){
        return "admin";
    }

    @RequestMapping(value="/menu", method=RequestMethod.GET)
    public ModelAndView menu() {

        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFact = cfg.buildSessionFactory();
        Session selectInventory = sessionFact.openSession();
        selectInventory.beginTransaction();
        Criteria c = selectInventory.createCriteria(CafeInventoryEntity.class);
        ArrayList<CafeInventoryEntity> menuList = (ArrayList<CafeInventoryEntity>) c.list();
        return new
                ModelAndView("menu", "cList", menuList);
    }




}

