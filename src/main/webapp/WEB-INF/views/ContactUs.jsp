 <%@ page isELIgnored="false" %>
 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Contact Page</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
      
       
 
 <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/contactUs.css"/>"  media ="screen"/>
 



</head>


<body>


<!--  the header section -->
<%@include file="header.jsp" %>







<!--  Content section with the content: to be done -->
<section class= "container">
 <div class = "content">
 <h2>Our Address:</h2>
 <div class="para">
	<p> ReChord Breakers,   <br>
			123 Warehouse Building, <br>
			Frankenstein Street ,<br>
			123456 New Town <br>
			My State <br>
			India			
	</p>
	</div>
</div>
</section>


<!--   the footer section -->
<%@include file="footer.jsp" %>
  
  
</body>

 


</html>