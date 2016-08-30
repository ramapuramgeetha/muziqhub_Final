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
  <script src="login.js"></script>
      
       
 <link rel="stylesheet" type="text/css" href="home.css"  media ="screen"/>
 <link rel="stylesheet" type="text/css" href="login.css"  media ="screen"/>
 




</head>


<body>


<!--  the header section -->
<%@include file="Header.jsp" %>




<!--  Content section with the content: to be done -->

 <section class="container">
 	<div class="loginform">  
	<form name="login" action="login" method="get" accept-charset="utf-8">
		<ul>  
    	  	<li><label for="username">UserName</label>  
    	  	<input type="text" name="user" required> </li>
        	<li><label for="password">Password</label>  
        	<input type="password" name="password" required> </li>
        	 <li><input type="button" id="my_centered_button" onclick = "check(this.form)" value="Login"> </button>   <a id="forgot_password" href ="Home.jsp"> Forgot Password</a></li>
	</ul>  
	</form>  
	</div>
</section>


<!--   the footer section -->
<%@include file="Footer.jsp" %>
  
</body>

 

</html>