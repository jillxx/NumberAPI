<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to the number page!!</h1>
<br>
<br>
<h1>Enter a date to get a result!</h1>
<form action="datefact">
Your day: <input type="text" name="day">
<br>
Your month: <input type="text" name="month">
<br><br><br><br>
<input type="submit" value="Submit">
</form>
<h1>Please Select the type of the random fact you want!</h1>
<form action="random">
<select>
	<option value="trivia">trivia</option>
  <option value="math">math</option>
  <option value="date">date</option>
  <option value="year">year</option>
</select>
<input type="submit" value="Generate Random">
</form></body>
</html>