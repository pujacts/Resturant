<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="form"%>
	<%@ taglib uri="http://www.springframework.org/tags"
	prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DineInReservationSystem
</title>
<spring:url value="/resources/css/main.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" />
<!-- <style>
/* .error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
} */
</style> -->
</head>
<body>
<h2>Dine In Reservation System</h2>
<form:form method="POST" commandName="dineInForm" action="save.do">
<table>
<tr>
<td> Resturant 
</td>
<td><form:select path="resturant">
<form:option value="" label="select resturant"></form:option>
<form:options items="${resturantList}"></form:options>
</form:select></td>
<td><form:errors path="resturant" cssClass="error"/></td>

</tr>
<tr>
<td>DIne Type</td>
<td><form:select path="dineType">
<form:option value="lake View" label="lake View"/>
<form:option value="Roof View" label="Roof View"/>
</form:select>
<td><form:errors path="dineType" cssClass="error" /></td>
</tr>
<tr>
<td>Date(DD/MM/yyyy)</td>
<td><form:input path="date"/></td>
<td><form:errors path="date" cssClass="error" /></td>
</tr>

<tr>
<td>TIme(Lunch/Dinner)</td>
<td>
12:00PM<form:radiobutton path="time"/></td>
<td>01:00PM<form:radiobutton path="time"/></td>
</tr>

<tr>
<td></td>
<td>
08:00PM<form:radiobutton path="time"/></td>
<td>09:00PM<form:radiobutton path="time"/></td>
<td><form:errors path="time" cssClass="error" /></td>
</tr>

<tr>
<td>No. Of Guest</td>
<td><form:input path="noOfGuest"/></td>
<td><form:errors path="noOfGuest" cssClass="error" /></td>
</tr>

<tr>
<td>name</td>
<td><form:input path="name"/></td>
<td><form:errors path="name" cssClass="error" /></td>
</tr>
<tr>
<td>Mobile Number</td>
<td><form:input path="mobNo"/></td>
<td><form:errors path="mobNo" cssClass="error" /></td>
</tr>
<tr>
<td><input type="submit" value="Confirm"></td>
</tr>
</table>
</form:form>
</body>
</html>