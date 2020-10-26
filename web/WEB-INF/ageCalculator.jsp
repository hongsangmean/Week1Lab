<%-- 
    Document   : ageCalculator
    Created on : Sep 23, 2020, 9:32:52 AM
    Author     : 703922
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
        <label>Enter your age:</label>
        <input type="text" name="your_age" value=${age}><br>
        <p>${message}</p>
        <input type="submit" value="Age next birthday">
        <a href="arithmetic">Arithmetic Calculator</a><br>
        </form>
    </body>
</html>
