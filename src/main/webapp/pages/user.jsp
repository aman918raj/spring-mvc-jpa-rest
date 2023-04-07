<%@ page language= "java" contentType= "text/html; charset=UTF-8"
    pageEncoding= "UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv= "Content-Type" content= "text/html; charset=UTF-8">
        <title>title</title>
    </head>
    <body>
        <form action="/addUser">
            <label for="firstname">First name:</label><br>
            <input type="text" name="firstname"><br>
            <label for="lastname">Last name:</label><br>
            <input type="text" name="lastname"><br>
            <label for="email">Email:</label><br>
            <input type="text" name="email"><br>
            <label for="age">Age:</label><br>
            <input type="text" name="age"><br>
            <input type="submit"><br>
        </form>

        <form action="/getUser">
            <label for="firstname">First name:</label><br>
            <input type="text" name="firstname"><br>
            <label for="lastname">Last name:</label><br>
            <input type="text" name="lastname"><br>
            <input type="submit"><br>
        </form>

        <form action="/getUserAgeGreaterThan">
            <label for="age">Age:</label><br>
            <input type="text" name="age"><br>
            <input type="submit"><br>
        </form>
    </body>
</html>