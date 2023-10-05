<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix= "c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Proyecto web página de inicio</title>
</head>
<body>
	<h1>Hola HTML</h1>
	
	<c:url var="urlDestino" value="/otra" />
	
	<a href='<c:out value="${urlDestino}" />'>Otra pagina</a>
	
	
</body>
</html>