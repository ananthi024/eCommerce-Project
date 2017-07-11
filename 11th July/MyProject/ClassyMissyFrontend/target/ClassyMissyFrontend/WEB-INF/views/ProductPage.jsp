<%@ page language="java" contentType="text/html"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="Header.jsp" %>

<div class="container">
<div class="col-sm-6 col-md-3">
<c:forEach items="${prodlist}" var="product"> 
<a href="ProductDesc/${product.prodid }" class="thumbnail">
<img src="<c:url value="/resources/images/${product.prodid }.jpg"/>" alt="Error on loading images"/>
</a>
<div class="caption">
<h4>${product.prodname}</h4>
<p>Rs.${product.price}</p>
</div>
</c:forEach>
</div>

</div>