<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
    <link href="../resources/styles.css" rel="stylesheet">
</head>
<body>
<p>Here's our menu:</p>

<table border=1>
    Item &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Price ($)
    <c:forEach var="myvar" items="${cList}">
        <tr>
            <td> ${myvar.productName}</td>
            <td> ${myvar.price}</td>

        </tr>
    </c:forEach>
</table>


</body>
</html>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>--%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<%--<html>--%>
<%--<head>--%>
    <%--<meta http-equiv="Content-Type" content="text/html;27charset=ISO-8859-1">--%>
    <%--<title>Menu</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<table border=1>--%>
    <%--<c:forEach var="myvar" items="${cList}">--%>
        <%--<tr><td>${myvar.productName}</td>--%>
            <%--<td>${myvar.price}</td></tr>--%>
    <%--</c:forEach></table>--%>
<%--</body>--%>
<%--</html>--%>