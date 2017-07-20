<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>

<form:form action="InsertSupplier" modelAttribute="Supplier">
<table align="center">
			<tr>
				<td colspan="2"><center>Supplier Details</center></td>
			</tr>
			<tr>
				<td>Supplier ID</td>
				<td><form:input path="supid" disabled="true" readonly="true" /></td><br>
			</tr>
			<tr>
				<td>Supplier Name</td>
				<td><form:input path="supname" required="true"/></td>
			</tr>
						
			<tr>
				<td>Supplier Address</td>
				<td><form:input path="supaddr" required="true" /></td>
			</tr>
				
			<tr>
			<td colspan="2"><input type="submit"  /></td>
			</tr>
</table>
</form:form>

<!-- Displaying the Supplier data using Table -->
<table cellspacing="2" align="center" border="1">

	<tr bgcolor="gray">
		<td>Supplier ID</td>
		<td>Supplier Name</td>
		<td>Supplier Address</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${suplist}" var="supplier">
		<tr bgcolor="pink">
			<td>${supplier.supid}</td>
			<td>${supplier.supname}</td>
			<td>${supplier.supaddr}</td>
			<td><a href="<c:url value="deleteSupplier/${supplier.supid}"/>">Delete</a>
				<a href="<c:url value="updateSupplier/${supplier.supid}"/>">Update</a>
			</td>
		</tr>
	</c:forEach>
</table>
<!-- Completed Displaying Table -->
<%@include file="Footer.jsp" %>
</body>
</html>