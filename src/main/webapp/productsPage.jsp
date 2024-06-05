<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%@page import="java.util.*"%>
  <%@page import="local.domain.Productos"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

</head>
<body>
<%
  List<Productos> productos  =  (List) request.getAttribute("productos");
%>

<div class ="container" > 

<table class="table">
  <thead>
    <tr>
      <th scope="col">id</th>
      <th scope="col">nombre</th>
      <th scope="col">foto</th>
      <th scope="col">descripcion</th>
      <th scope="col">precio</th>
      <th scope="col">tamaño</th>
      <th scope="col">stock</th>
        <th scope="col">operaciones</th>
    </tr>
  </thead>
  <tbody>
<%for(int i=0;i<productos.size();i++){
	%>
	 
	<tr bgcolor="white">
	<td><%=productos.get(i).getId() %></td>
	<td><%=productos.get(i).getNombre()%></td>
	<td><%=productos.get(i).getFoto()%></td>
	<td><%=productos.get(i).getDescripcion()%></td>
	<td><%=productos.get(i).getPrecio()%></td>
	<td><%=productos.get(i).getTamaño()%></td>
	<td><%=productos.get(i).getStock()%></td>
	<td> 
		<a class="btn btn-primary"  href="<%=request.getContextPath()%>/ProductsController?id=<%=productos.get(i).getId()%>" > comprar </a>
	 	<button class="btn btn-danger"> eliminar </button>
	 </td>
<%		
}
%>
 </tbody>

</table>
 </div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>