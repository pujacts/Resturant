<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form"%>
	<%@ taglib uri="http://www.springframework.org/tags"
	prefix="spring"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<%@ page isELIgnored="false"%>
<title>DineInReservationSystem
</title>
</head>
<body>
<h2>Dine-In reservation system</h2>
<h4>Acknowledgement---------------------------------</h4>
<h3>Thank you for choosing ${dineInForm.resturant} resturant</h3>
<h4>Here are your details</h4>
Customer name : ${name} <br>  
No of guest : ${dineInForm.noOfGuest} <br>  
Time: ${dineInForm.time}<br>  
<p><a href="/springexample/fileUploadPage">to upload id proof click here</a></p>
</body>
</html>