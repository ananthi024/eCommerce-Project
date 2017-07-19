<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="Header.jsp" %>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<table class="table table-bordered" align="center" border="1">
  <thead>
    <tr>
   
<tr bgcolor="gray">
<td colspan="3"><center>Product Description</center></td>
</tr>
</tr>
 </thead>
  <tbody>
<tr>
<td rowspan="6"><img src="<c:url value="/resources/images/${product.prodid }.jpg"/>" class="thumbnail" style="height:200px; width:60%" alt="Error on loading images"/>
</tr>
<tr>
<td>Product Name</td><td>${prodinfo.prodname }</td>
</tr>
<tr>
<td>Product Description</td><td>${prodinfo.proddesc }</td>
</tr>
<tr>
<td>Price</td><td>Rs.${prodinfo.price }</td>
</tr>
<tr>
<td></td>
<td>
<form action="<c:url value="/addToCart/${prodinfo.prodid }"/>" method="get">
Quantity<input type="text" name="quantity" class="form-control btn-block" />
 <!--  <select>
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>

</select>-->
<input type="submit" value="AddToCart" class="btn btn-xs btn-success btn-block" />
</form>
</td>
</tr>
</tbody>
</table>
<%@include file="Footer.jsp" %>
</body>
</html>




  