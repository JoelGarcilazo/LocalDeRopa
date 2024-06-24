<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@page import="java.util.*"%>
<%@page import="local.domain.Productos"%>

<!DOCTYPE html>


<%	String usuario = (String) request.getSession().getAttribute("sUsuario");

	String nivel = (String) request.getSession().getAttribute("sRol");
	
	if(usuario==null){
		response.sendRedirect("/login");
	}

%>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Productos</title>
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0" />
  <link rel="stylesheet" href="<%=request.getContextPath()%>/maquetado/adminDashboard/style.css">
</head>

<body>
  <div class="container">
    <aside>

      <div class="top">
        <div class="close" id="close_btn">
          <span class="material-symbols-sharp">
            close
          </span>
        </div>
      </div>

      <div class="sidebar">
        <a href="<%=request.getContextPath()%>/productos" class="active">
          <span class="material-symbols-sharp">grid_view </span>
          <h3>Productos</h3>
        </a>
        <a href="<%=request.getContextPath()%>/pedidos">
          <span class="material-symbols-sharp">receipt_long </span>
          <h3>Pedidos</h3>
        </a>
        <a href="<%=request.getContextPath()%>/agregarProducto">
          <span class="material-symbols-sharp">add </span>
          <h3>Agregar Producto</h3>
        </a>
        <a href="slogin?conf=0">
          <span class="material-symbols-sharp">logout </span>
          <h3>Cerrar Sesion</h3>
        </a>

      </div>

    </aside>

    <main>
      <h1>Flower.</h1>

      <div class="recent_order">
      
      <% List<Productos> productos  =  (List) request.getAttribute("productos");%>
      
        <h2>Productos</h2>
        <table>
          <thead>
            <tr>
              <th>ID</th>
              <th>Nombre</th>
              <th>Imagen</th>
              <th>Descripcion</th>
              <th>Precio</th>
              <th>Stock</th>
              <th>Modificar</th>
              <th>Eliminar</th>
            </tr>
          </thead>
          <tbody>
          <% for(int i=0;i<productos.size();i++){ %>
            <tr>
              <td><%=productos.get(i).getIdProducto() %></td>
	            <td><%=productos.get(i).getNombre()%></td>
	            <td><%=productos.get(i).getFoto()%></td>
	            <td><%=productos.get(i).getDescripcion()%></td>
	            <td><%=productos.get(i).getPrecio()%></td>
	            <td><%=productos.get(i).getStock()%></td>
              <td><a href="/delete&idProducto" class="btn btn-outline-warning" style="color: blue">Editar</a></td> 
              <td><a href="/delete" class="btn btn-outline-danger" style="color: red">Eliminar</a></td>            
            </tr>
          <% } %>
          </tbody>
        </table>
      </div>

    </main>
    <div class="right">
      <div class="top">
        <button id="menu_bar">
          <span class="material-symbols-sharp">menu</span>
        </button>

        <div class="theme-toggler">
          <span class="material-symbols-sharp active">light_mode</span>
          <span class="material-symbols-sharp">dark_mode</span>
        </div>
        <div class="profile">
          <div class="info">
            <p><b>Aylen</b></p>
            <p>Admin</p>
            <small class="text-muted"></small>
          </div>
        </div>
      </div>
    </div>
  </div>

  <script src="<%=request.getContextPath()%>/maquetado/adminDashboard/script.js"></script>
</body>
</html>