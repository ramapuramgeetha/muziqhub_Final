 <%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
      
       
 <link rel="stylesheet" type="text/css" href="<c:url value="resources/css/header.css"/>"  media ="screen"/>
</head>
<body>
<!--  The Header section with the navigation menu -->
<header class= "container">
	<div id="header1" class="row">
		<h1 class ="col-sm-4" id="logosmall"><img src="<c:url value="/resources/images/Logomakr_small.png"/>"/></h1>
		<h1 class ="col-sm-8" id="logo"><img src="<c:url value="/resources/images/logo.png"/>"/></h1>
		
	</div>
	<div id="header2" class="row">
			<nav class="col-sm-5">
				<p><a href ="index"> Home </a></p>
				<div class="dropdown">
   						 <a href="#" data-toggle="dropdown" class="dropdown-toggle">Products <span class="caret"></span></a>
    					<ul class="dropdown-menu">
    							<li><a href="#">All Instruments</a></li>
        						<li><a href="#">String Instruments</a></li>
        						<li><a href="#"> Wind Instruments</a></li>
        						<li><a href="#"> Keyboard Instruments </a></li>
        						<li><a href="#"> Percussion Instruments</a></li>
        						<li><a href="#"> Accessories</a></li>
    					</ul>
				</div>
				<!-- <p><a href ="Products"> Products </a></p>  -->
				
				<p> <a href ="about">About Us </a></p>
				<p> <a href ="contactUs">Contact Us </a></p>
				</nav>	
				<navusr class ="col-sm-4">
						<p><a href ="signUp"> Sign -Up </a></p>
						<p><a href ="signIn"> Sign-in </a></p>
					</navusr>
					<navmedia class="col-sm-3">
					<ul>
  						<li class="col-sm-1"><a href="https://twitter.com/"><img src="<c:url value="/resources/images/Twitter-2-32.png"/>"></a></li>
  						<li class="col-sm-1"><a href="https://www.facebook.com/"><img src="<c:url value="/resources/images/Facebook-2-32.png"/>"></a></li>
  						<li class="col-sm-1"><a href="https://www.instagram.com/"><img src="<c:url value="/resources/images/Instagram-2-32.png"/>"> </a></li>
					</ul>
					</navmedia>
	</div>
</header>

<script src="content/js/jquery.min.js"></script>
<script src="content/js/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        $('.dropdown-toggle').dropdown();
    });
</script>

</body>
</html>