<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>Muziq Hub Home</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
    
 <link rel="stylesheet" type="text/css" href="/resources/css/home.css"  media ="screen"/>
 <link rel="stylesheet" type="text/css" href="/resources/css/HomeContent.css"  media ="screen"/>




</head>


<body>

<!--  the header section -->
<%@include file="/WEB-INF/views/Header.jsp" %>


<!--  the carousel section -->
<%@include file="/WEB-INF/views/Carousel.jsp" %>




<!--  Content section with the content: to be done -->
<section class= "container">
 <div class = "contents">	
 				<a href ="Login.jsp">
 					<img src="https://thumbs.dreamstime.com/x/grunge-music-instrument-background-16382653.jpg"  class="image-responsive">
 					<p>Stringed Instruments</p>
 				</a> 
 	</div>
	 <div class = "contents">
	 		<img src="https://thumbs.dreamstime.com/x/grunge-music-instrument-background-14214837.jpg"  class="image-responsive">
	 		<p> Wind Instruments </p>
	 </div>
	 <div class = "contents">
	 		<img src="https://thumbs.dreamstime.com/x/grunge-music-instrument-background-14214782.jpg"  class="image-responsive">
	 		<p> Keyboard Instruments </p>
	 </div>
	 <div class = "contents">
	 		<img src="https://thumbs.dreamstime.com/x/grunge-music-instrument-background-16382465.jpg"  class="image-responsive">
	 		<p> Percussion Instruments </p>
	 	</div>
	 <div class = "contents">
	 		<img src="https://thumbs.dreamstime.com/x/musick-grunge-3883901.jpg"  class="image-responsive">
	 		<p>Instrument Accessories </p>
	 	</div>
</section>

<!--  the footer section -->
<%@include file="/WEB-INF/views/Footer.jsp" %>

  
  
</body>

 
 


</html>