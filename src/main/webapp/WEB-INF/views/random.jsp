<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Random Fact</title>
</head>
<body>
<h1>Random Fact</h1>
<h4>${random.number} ${random.year}: ${random.text}.
</h4>
<br>

</body>
</html>