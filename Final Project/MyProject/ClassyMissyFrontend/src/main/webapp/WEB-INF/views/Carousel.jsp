<%@ page language="java" contentType="text/html"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
    </ol>
    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <center><img src="http://hdwallpaperbackgrounds.net/wp-content/uploads/2015/08/beautiful-girl-jewelry-widescreen-hd-wallpapers.jpg"  width="1160" height="445"></center>
      </div>

      <div class="item">
        <center><img src="http://hdwallpaperbackgrounds.net/wp-content/uploads/2015/08/woman-earrings-jewelry-makeup-wallpapers-1680x1050.jpg"  width="1160" height="445"></center>
      </div>
    
      <div class="item">
        <center><img src="http://hdwallpaperbackgrounds.net/wp-content/uploads/2015/11/Jewelry-HD-Wallpapers-Desktop-Widescreen.jpg"  width="1160" height="445"></center>
      </div>

      <div class="item">
        <center><img src="http://hdwallpaperbackgrounds.net/wp-content/uploads/2015/11/jewelry-box-necklace-pendant.jpg"  width="1160" height="445"></center>
      </div>
	<div class="item">
        <center><img src="http://hdwallpaperbackgrounds.net/wp-content/uploads/2015/10/Diamond-gold-and-platinum-bangle-jewellery.jpg"  width="1160" height="445"></center>
      </div>
	<div class="item">
        <center><img src="http://cdn.skim.gs/images/aua703gzvniv1xphl0o5/how-to-clean-jewelry-at-home"  width="1160" height="445"></center>
      </div>
    </div>
    
        <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
    </div>
  </div>
</div>

</body>
</html>