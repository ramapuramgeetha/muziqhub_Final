<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
   <base href="resources/" target="_blank">    
       
 <link rel="stylesheet" type="text/css" href="resources/home.css"  media ="screen"/>
 <link rel="stylesheet" type="text/css" href="/resources/Carousel.css"  media ="screen"/>
 
</head>
<body>


<!--  The Carousel section :   -->
<div class="container">
<div id="pageCarousel" class="carousel slide" data-ride="carousel">
	<ol class="carousel-indicators">
		<li data-target ="#pageCarousel" data-slide-to ="0" class="active"> </li>
		<li data-target ="#pageCarousel" data-slide-to ="1" > </li>
		<li data-target ="#pageCarousel" data-slide-to ="2" > </li>
		<li data-target ="#pageCarousel" data-slide-to ="3" > </li>
		<li data-target ="#pageCarousel" data-slide-to ="4" > </li>
	</ol>
	
	<div class ="carousel-inner">
	
			<div class ="item active">
								<img  src="
https://thumbs.dreamstime.com/x/grunge-music-instrument-background-16382653.jpg" alt ="String Instruments" class="img-responsive">
				    			<div class="carousel-caption" >
							<h2 > String</h2>
							<h2 >  Instruments </h2>
					</div>
			</div>
			
			<div class ="item ">
					<img src="
https://thumbs.dreamstime.com/x/grunge-music-instrument-background-14214837.jpg" alt ="Wind Instruments" class="img-responsive">
					<div class="carousel-caption">
							<h2> Wind</h2>
							<h2>  Instruments </h2>
					</div>
			</div>
			
			<div class ="item ">
					<img src="
https://thumbs.dreamstime.com/x/grunge-music-instrument-background-14214782.jpg" alt ="KeyBoard Instruments" class="img-responsive">
				<div class="carousel-caption caption-shadow">
							<h2> KeyBoard</h2>
							<h2>Instruments </h2>
					</div>
			</div>
			
	
			<div class ="item ">
					<img src="
https://thumbs.dreamstime.com/x/grunge-music-instrument-background-16382465.jpg" alt ="Percussion Instruments" class="img-responsive">
				<div class="carousel-caption caption-shadow">
							<h2> Percussion</h2>
							<h2>Instruments </h2>
					</div>
			</div>
			<div class ="item ">
					<img src="
https://thumbs.dreamstime.com/x/musick-grunge-3883901.jpg" alt ="Accessories" class="img-responsive">
				<div class="carousel-caption caption-shadow">
							<h2> Accessories</h2>
					</div>
			</div>
			
	</div>
	
<a class ="left carousel-control" href = "#pageCarousel" role ="button" data-slide="prev">
<span class ="glyphicon glyphicon-chevron-left" ></span>
</a>

<a class ="right carousel-control " href = "#pageCarousel" role ="button" data-slide="next">
<span class ="glyphicon glyphicon-chevron-right" > </span>
</a>
 
</div>
 </div>

<!-- Carousel -->

<! --script to slide--> 
<script type="text/javascript">

	$('.carousel').carousel({
		interval: 3000
	})
	
</script>



<!--  Check to see if jquery works

<script type="text/javascript">
$(document).ready(function(){ 
						   
	$("div").css("border", "3px solid red");
	
});
</script>

-->


</body>
</html>