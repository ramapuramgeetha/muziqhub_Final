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
<%@include file="header.jsp" %>

<!-- The product entry  form -->
<div class="form">
<p> Please enter the details of the product you wish to add/update </p>
<form name ="vendDetails" action ="Login" method="post">
<h2>Vendor Details</h2>
<table class="userdata">
	<tr>
		<td> Vendor Id : </td>
		<td> <input type="text" name="vendId"/> </td>
	</tr>
	<tr>
		<td> Vendor Name : </td>
		<td> <input type="text" name="vendName"/> </td>
	</tr>
	<tr >
		<td > Address Line 1 : </td>
		<td> <input type="textarea" rows="9" name="vendAddress1"/></td>
	</tr>
	<tr >
		<td > Address Line 2 : </td>
		<td> <input type="textarea" rows="9" name="vendAddress2"/></td>
	</tr>
	<tr >
		<td > City : </td>
		<td> <input type="textarea" rows="9" name="vendCity"/></td>
	</tr>
	<tr>
		<td> State  : </td>
		<td> <input type="text" name="vendState"/> </td>
	</tr>
	<tr>
		<td> Pin Code : </td>
		<td> <input type="text" name="vendPin"/> </td>
	</tr>
	<tr>
		<td> Country : </td>
		<td> <input type="text" name="vendCountry"/> </td>
	</tr>
	<tr>
		<td> Phone Number : </td>
		<td> <input type="text" name="vendPhone"/> </td>
	</tr>
</table>
<div class="button">
		<input type="submit" name="btnSubmit" value="submit" onClick="Submit" >
</div>
</form>
</div>



<!--   the footer section -->
<%@include file="footer.jsp" %>
</body>
</html>