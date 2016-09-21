 <%@ page isELIgnored="false" %>
 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
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
  
    
 <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/home.css"/>"  media ="screen"/>
 <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/HomeContent.css"/>"  media ="screen"/>




</head>


<body>

<!--  the header section -->
<%@include file="header.jsp" %>


<%@include file="carousel.jsp"%>




<!--  Content section with the content: to be done -->
<section class= "container">
 <div class = "contents">	
 				<img src="<c:url value="resources/images/mosaic_guitar_18x12-400x600.jpg"/>" class="image-responsive">
 					<p>String Instruments</p>
 				
 	</div>
	 <div class = "contents">
	 		<img src="https://dncache-mauganscorp.netdna-ssl.com/thumbseg/1520/1520364-bigthumbnail.jpg"  class="image-responsive">
	 		<p> Wind Instruments </p>
	 </div>
	 <div class = "contents">
	 		<img src="https://images8.alphacoders.com/408/thumb-350-408274.jpg"  class="image-responsive">
	 		<p> Keyboard Instruments </p>
	 </div>
	 <div class = "contents">
	 		<img src="http://www.drummagazine.com/images/gear/041013-vistalite-tivoli.jpg"  class="image-responsive">
	 		<p> Percussion Instruments </p>
	 	</div>
	 <div class = "contents">
	 		<img src="<c:url value="resources/images/headphones.jpg"/>"  class="image-responsive">
	 		<p> Music Accessories </p>
	 	</div>
</section>

<!--  the footer section -->
<%@include file="footer.jsp" %>

  
  
</body>

 
 


</html>