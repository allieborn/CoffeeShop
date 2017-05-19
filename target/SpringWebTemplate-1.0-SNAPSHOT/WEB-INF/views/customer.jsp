<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>New Customer Registration Page</title>
    <style>

    </style>
    <link href="../resources/styles.css" rel="stylesheet">
</head>
<body>

<h2>New Customer Registration</h2>

<form:form name="customerInfo" method="POST" action="/customerGreeting" onsubmit="return validateForm()">

    <table>
        <tr>
            <td><form:label path="name" name="name">Name</form:label></td>
            <td><form:input path="name" name="name"/></td>
        </tr>
        <tr>
            <td><form:label path="email" name="email">Email</form:label></td>
            <td><form:input path="email" name ="email"/></td>
        </tr>
        <tr>
            <td><form:label path="phone">Phone</form:label></td>
            <td><form:input path="phone"/></td>
        </tr>
        <tr>
            <td><form:label path="city">Your City</form:label></td>
            <td><form:input path="city"/></td>
        </tr>
        <tr><td></td></tr> <!--TRYING TO SPACE OUT, BUT THIS DOESN'T WORK -->
        <tr>
            <td>What's your usual morning drink?</td>
        </tr>
        <tr>
            <td><input type="radio" name="favItem" value="favItem"> Regular Coffee<br></td>
        </tr>
        <tr>
            <td><input type="radio" name="favItem" value="favItem"> Espresso Drinks<br></td>
        </tr>
        <tr>
            <td><input type="radio" name="favItem" value="favItem"> Tea<br></td>
        </tr>
        <tr>
            <td><input type="radio" name="favItem" value="favItem"> Hard Drinks! (mimosas, bloody mary's)<br></td>
        </tr>
    </table>
    <p></p>

    <td>What time do you normally visit the cafe?</td>
    <select>
        <option value="earlyMorning">Super Early (before 8am)</option>
        <option value="midMorning">Morning (8am-11am)</option>
        <option value="day">Day (12 -5pm)</option>
        <option value="evening">Evening and later (5pm +)</option>
    </select>

    <table>
        <td colspan="2"></td>
        <td>

            <input type="submit" value="Submit"/>
        </td>
        </tr>
    </table>
</form:form>

<script>

    function validateForm() {
        var name = document.forms["customerInfo"]["name"].value;
        var email = document.forms["customerInfo"]["email"].value;

        if (name == ""){
            alert ("You must enter your name in order to register.");
            return false;
        }
        if (email == ""){
            alert ("You must enter an email address.");
            return false;
        }
        if (!email.includes('@')){
            alert ("hmmm...looks like you didn't enter a valid email address.");
            return false;
        }
        if (name.length < 2 || email.length < 2){
            alert ("Input must be longer than 2 characters");
            return false;
        }
    }
</script>


</body>
</html>

