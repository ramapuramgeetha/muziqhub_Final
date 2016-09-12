 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
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
<%@include file="Header.jsp" %>

<!-- The registration form -->
<div class="form">
<p> Thanking for deciding to Sign-up with Muziq Hub. 
We need a few details to make your experience with us a pleasant one</p>
<form name ="signin" action ="Login" method="post">
<h2>Your Details</h2>
<table class="userdata">
	<tr>
		<td> User Name <span id="imp">*</span> : </td>
		<td> <input type="text" name="uname"/> </td>
	</tr>
	<tr>
		<td> Password <span id="imp">*</span> : </td>
		<td> <input type="password" name="passWrd"/> </td>
	</tr>
	<tr>
		<td> Confirm Password <span id="imp">*</span> : </td>
		<td> <input type="password" name="cfrmPass"/> </td>
	</tr>
		<tr>
		<td> First Name <span id="imp">*</span> : </td>
		<td> <input type="text" name="fName"/> </td>
	</tr>
		<tr>
		<td> Last Name <span id="imp">*</span> : </td>
		<td> <input type="text" name="lName"/> </td>
	</tr>
		<tr >
		<td class="add"> Address : </td>
		<td> <input type="textarea" rows="9" name="Address"/></td>
	</tr>
		<tr>
		<td> State  : </td>
		<td> <input type="text" name="State"/> </td>
	</tr>
		<tr>
		<td> Pin Code : </td>
		<td> <input type="text" name="Pin"/> </td>
	</tr>
		<tr>
		<td> Country : </td>
		<td> <input type="text" name="Country"/> </td>
	</tr>
</table>
<input type="checkbox"/> I have read and agreed to all the terms and conditions specified for signing up
<br>
<div class="button">
		<input type="submit" name="btnSubmit" value="Submit" onClick="Submit" >
</div>
</form>
</div>



<!--   the footer section -->
<%@include file="Footer.jsp" %>
</body>
</html>