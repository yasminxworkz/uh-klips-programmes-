<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fill details of your favourite person</h1>
<form action="favourite"  method="post">
<pre>
FirstName<input type="text" name="fname"/>
LastName<input type="text" name="lname"/>
Gender<input type="radio" name="gen">female
       <input type="radio" name="gen">male
Reason<textarea rows="5" cols="30" name="reas"></textarea>
Address<textarea rows="5" cols="30" name="add"></textarea>
<input type="submit" value="submit">
<a href="FavouritePerson.jsp"></a>
</pre>
</form>

</body>
</html>