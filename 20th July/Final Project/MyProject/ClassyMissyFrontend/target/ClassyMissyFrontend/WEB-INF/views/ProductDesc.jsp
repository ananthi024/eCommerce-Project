<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="UserHeader.jsp" %>
<table width="60%" align="center" border="1">
<tr bgcolor="gray">
<td colspan="3"><center>Product Description</center></td>
</tr>
<tr>
<td rowpan="6"><img scr="<c:url value="/resources/images/${prodinfo.prodid }.jpg" />"/></td>
</tr>
<tr>
<td>Product ID</td><td>${prodinfo.prodid }</td>
</tr>
<tr>
<td>Product Name</td><td>${prodinfo.prodname }</td>
</tr>
<tr>
<td>Supplier</td><td>${prodinfo.supid }</td>
</tr>
<tr>
<td>Product Desc</td><td>${prodinfo.proddesc }</td>
</tr>
<tr>
<td>Price</td><td>${prodinfo.price }</td>
</tr>
<tr>
<td></td>
<td>
<form action="<c:url value="/addToCart/${prodinfo.prodid }"/>" method="get">
Quantity<input type="text" name="quantity" class="form-control btn-block" />
<input type="submit" value="AddToCart" class="btn btn-xs btn-success btn-block" />
</form>
</td>
</tr>
<%@include file="Footer.jsp" %>
</body>
</html>