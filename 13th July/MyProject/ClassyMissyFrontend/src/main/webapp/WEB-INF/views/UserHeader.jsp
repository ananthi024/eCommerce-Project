<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>ClassyMissy</title>
	
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

</head>
<body style="background-color:#f5cba7">
<form action="gh">
<!-- Starting The Navbar Code -->
<nav class="navbar navbar-inverse">
<div class="container-fluid">

<div class="navbar-header">
<a class="navbar-brand" rel="home" href="#" title="The Exprssion of Pearl">
                <img style="max-width:50px; margin-top: -7px;"
                     src="D:\cma2.jpg">
            </a>
<a class="navbar-brand" href="Home.jsp"></a>
</div>
<div>


<ul class="nav navbar-nav">
<li>ClassMissy</li>
<li class="active"><a href="UserHome"><span class="glyphicon glyphicon-home"></span>Home</a></li>
<li><a href="AboutUs">AboutUs</a></li>
<li><a href="ContactUs">ContactUs</a></li>

<div class="nav navbar-nav navbar-right">
<li><a href="#">${sessionScope.username}</a></li>
<li><a href="Header">Logout</a></li>

  </div>
 
 
 </ul>
 </div>
 
  </div>


</div>
</nav>
</form>
</body>
</html>