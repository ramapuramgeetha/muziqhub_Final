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

<link rel="stylesheet" type="text/css" href ="<c:url value="resources/css/prodDetails.css"/>" media ="screen"/>

</head>


<body>
<!--  the header section -->
<%@include file="header.jsp" %>

<!-- The category entry  form -->
<div class="form">
<p> Please enter the details of the category  you wish to add/update </p>
<form name ="categoryDetails" action ="Login" method="post">
<h2>Category Details</h2>
<table class="proddata">
	<tr>
		<td> Category Id : </td>
		<td> <input type="text" name="catId"/> </td>
	</tr>
	<tr>
		<td> Category Name: </td>
		<td> <input type="text" name="catName"/> </td>
	</tr>
	<tr>
		<td> Description  : </td>
		<td> <input type="text" name="catDesc"/> </td>
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