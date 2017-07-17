<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="UserHeader.jsp" %>
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
</head>
<table class="table table-bordered" colspan="5"><center><h3>Shopping Cart</h3></center>
  <thead>
    <tr>
<tr bgcolor="gray">
<th>Product Name</th>
<th>Quantity</th>
<th>SubTotal</th>
<th>Image</th>
</tr></tr>
</thead>
<tbody>
    <tr>
    
<c:forEach items="${cartitems}" var="cartitem">
<tr>
<td>${cartitem.prodname}</td>

<td><input type="text" value="${cartitem.quantity }" name="quantity" required/></td>
<td>${cartitem.price * cartitem.quantity }</td>
<td><img src="<c:url value="/resources/images/${product.prodid }.jpg"/>" style="height:200px; width:60%" alt="Error on loading images"/>
</tr>
</c:forEach>
<tr>
<td colspan="3">Grand Total</td>
<td>${grandtotal }</td>
</tr>
</table>

<!-------------------------------------------------------Payment Information------------------------------->
<table class="table table-inverse" cellspacing="3" cellpadding="2" align="center">
  <thead>
    <tr>
    <tr bgcolor="gray">
<td colspan="2"><center><strong><h3><b>Payment Information</b></h3></strong></center></td>
</tr>
</thead>
<tbody>

<tr>
<td><h4><b>Payment Mode</b></h4></td>
<td>
<input type="radio" name="pmode" value="CC" /><b>Credit Card</b>
<input type="radio" name="pmode" value="IB" /><b>Internet Banking</b>
<input type="radio" name="pmode" value="CD" /><b>Cash On Delivery</b>
</td>
</tr>
<tr bgcolor="pink">
<td colspan="2"><center><a href="OrderConfirm"><input type="submit" value="pay" /></center></td>
</tr>
</tbody>
</table>  


    

<%@include file="Footer.jsp" %>
</body>
</html>