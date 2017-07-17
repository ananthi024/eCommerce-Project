<%@ page language="java" contentType="text/html"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="UserHeader.jsp" %>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<table class="table table-bordered" colspan="5" align="center">
  <thead>
    <tr>
<tr bgcolor="gray">
<th>Product Name</th>
<th>Quantity</th>
<th>SubTotal</th>
<th>Image</th>
<th>Operation</th>
</tr>
</thead>
<tbody>
    <tr>
<c:forEach items="${cartitems }" var="cartitem">
<tr>
<form action="<c:url value="/updateCartItem/${cartitem.citemid }" />" />
<td>${cartitem.prodname }</td>
<td><input type="text" value="${cartitem.quantity}"name="quantity" required/></td>
<td>Rs.${cartitem.price * cartitem.quantity}</td>
<td><img src="<c:url value="/resources/images/${product.prodid }.jpg"/>" style="height:200px; width:60%" alt="Error on loading images"/>
<td>
<input type="submit" value="UPDATE" class="btn-success btn-block"/>
<a href="<c:url value="/deleteCartItem/${cartitem.citemid }" />">DELETE </a>
</td>
</tr>
</c:forEach>
<tr>
<td><a href="<c:url value="/CheckOut" />"> <b><h4>CheckOut</h4></b></a></td>
</tr>




</tbody>
</table>
<%@include file="Footer.jsp" %>
</body>
</html>




