<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
 <%@ taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<header>
			<h1 align="left">CapStore</h1>
			<h2 align="right"><a href="index.jsp">Home</a></h2>
			<h1 align="center">Invoice</h1>
</header>


			<table >
				<tr>
					<th><span>Invoice No.:</span></th>
					<td><span>101138</span></td>
				</tr>
				<tr>
					<th><span>Date</span></th>
					<td><span>12-dec-2018</span></td>
					<td></td>
				</tr>
				
			</table>

<table border="2">
<tr>
<th>Product Id</th>
<th>Product Name  </th>
<th> Price </th>

<th>Total Price </th>
<th></th>
</tr>

<tr>
<td> ${prod.prodId} </td>
<td> ${prod.prodName} </td>
<td> ${prod.price} </td>


<th>${prod.price} </th>
<td> <a href = "homePage" > </a> </td>
</tr>

</table>

</body>
</html>