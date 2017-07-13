<%@ page language="java" contentType="text/html"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="Header.jsp" %>
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
<c:forEach items="${cartitems }" var="cartitem">
<tr>
<td>${cartitem.prodname }</td>
<td>${cartitem.quantity }</td>
<td><input type="text" value="${cartitem.quantity }" name="quantity" required/></td>
<td>${cartitem.price * cartitem.quantity }</td>
<td><img src="<c:url value='/resources/images/${cartitem.prodid }.jsp'/>" width="100" height="100">
</tr>
<tr>
<td colspan="3">Grant Total</td>
<td>${grandtotal }</td>
</tr>
</c:forEach>
</tr>
</tbody>
</table>

<!-------------------------------------------------------Payment Information------------------------------->

<table class="table table-inverse" cellspacing="3" cellpadding="2" align="center">
  <thead>
    <tr>

<tr bgcolor="gray">
<td colspan="2">Payment Information</td>
</tr>
</thead>
<tbody>
    
<tr>
<td>Payment Mode</td>
<td>
<input type="radio" name="pmode" value="CC" />Credit Card
<input type="radio" name="pmode" value="IB" />Internet Banking
<input type="radio" name="pmode" value="CD" />Cash On Delivery
</td>
</tr>
<tr bgcolor="gray">
<td colspan="2"><input type="submit" value="pay" /></td>
</tr>
</tbody>

</table>
<%@include file="Footer.jsp" %>
</body>
</html>