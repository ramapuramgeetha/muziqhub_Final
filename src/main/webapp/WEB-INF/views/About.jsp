 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>About</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
      
 <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/about.css"/>"  media ="screen"/>
  
 
 



</head>


<body>


<!--  the header section -->
<%@include file="header.jsp" %>





<!--  Content section with the content: to be done -->
<section class= "container">
 <div class = "content">

 	<h1>About Muziq Hub</h1>
 	<br>
 	<div class="para">
			<p> Muziq Hub is an online music store that aims to provide 
							a bridge between new artists and their fans<p>
			<p>Music is a powerful entity speaking directly to the soul. </p> 

			<p> Whether you are a fan of the classics or a head thumping hard rocker, 
					Muziq Hub lets you access your favorite music legally  </p>

			<p> All you have to do is choose the music, pay for it and then download it from the link 
						sent to the registered email address</p>
			<p> So what are you waiting for? </p>
	</div>
</div>
</section>


<!--   the footer section -->
<%@include file="footer.jsp" %>
  
  
</body>

 


</html>