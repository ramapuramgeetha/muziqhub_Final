 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign-up</title>

 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="stylesheet" type="text/css" href ="<c:url value="resources/css/signUp.css"/>" media ="screen"/>

</head>


<body>
<!--  the header section -->
<%@include file="header.jsp" %>

<!-- The registration form -->
<div>
<form:form method="POST" action="save" commandName="userForm">
			<p> Thanks for deciding to Sign-up with Muziq Hub. 
				We need a few details to make your experience with us a pleasant one</p>
				<h2>Your Details</h2>
			<table >
				<tr>
						<td> User Name <span id="imp">*</span> : </td>
						<td> <form:input  path="uname"/> </td>
				</tr>
				<tr>
						<td> Password <span id="imp">*</span> : </td>
						<td> <form:password  path="usrPasswod"/> </td>
				</tr>
				<tr>
						<td> Confirm Password <span id="imp">*</span> : </td>
						<td> <form:password  path="cfrmPass"/> </td>
				</tr>
				<tr>
						<td> Name <span id="imp">*</span> : </td>
						<td> <form:input  path="usrName"/> </td>
				</tr>
				<tr>
						<td> e-mail <span id="imp">*</span> : </td>
						<td> <form:input  path="usrEmail"/> </td>
				</tr>
				<tr >
						<td > Address Line 1 : </td>
						<td> <form:input  path="address1"/></td>
				</tr>
				<tr >
						<td > Address Line 2 : </td>
						<td> <form:input  path="address2"/></td>
				</tr>
				<tr >
						<td > City : </td>
						<td> <form:input  path="city"/></td>
				</tr>
				<tr>
						<td> State  : </td>
						<td> <form:input  path="state"/> </td>
				</tr>
				<tr>
						<td> Pin Code : </td>
						<td> <form:input  path="pin"/> </td>
				</tr>
				<tr>
						<td> Country : </td>
						<td> <form:input  path="country"/> </td>
				</tr>
				<tr>
						<td> Phone No : </td>
						<td> <form:input  path="phone"/> </td>
				</tr>
		</table>
		<form:checkbox path="TandC"/> I have read and agreed to all the terms and conditions specified for signing up
		<br>
		<div class="button">
			<input type="submit"  value="Save" >
		</div>
</form:form>
</div>



<!--   the footer section -->
<%@include file="footer.jsp" %>
</body>
</html>