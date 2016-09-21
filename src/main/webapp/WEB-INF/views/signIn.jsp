 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Sign-In</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      
       
  <link rel="stylesheet" type="text/css"  href="<c:url value="resources/css/signIn.css"/>"  media ="screen"/>
 




</head>


<body>


<!--  the header section -->
<%@include file="header.jsp" %>




<!--  Content section with the content: to be done -->

 <section class="container">
 	 
<div class="loginform">
	<form name="login" action="login" method="post"> 
		<h2>Your Details</h2>
		<table class="logindata">
			<tr>
				<td> User Name  : </td>
				<td> <input type="text" name="uname"/> </td>
			</tr>
			<tr>
				<td> Password  : </td>
				<td> <input type="password" name="passWrd"/> </td>
			</tr>
			<tr>
				<td><a href ="productDetails">Product details</a></td>
			</tr>
			<tr>
				<td><a href ="category">Category details</a></td>
			</tr>
						<tr>
				<td><a href ="vendor">vendor details</a></td>
			</tr>
			</table>

			<div class="button">
				<input type="submit" name="btnSubmit" value="Sign-in" onClick="Submit" >
			</div>
	</form>
</div>
</section>

<!--   the footer section -->
<%@include file="footer.jsp" %>
  
</body>

 

</html>