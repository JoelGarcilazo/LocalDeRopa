<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="local.domain.cotroller.LoginController"%>
<%@page import="local.domain.Login"%>
<%@page import="local.domain.dao.AbstractLoginDaoImpl"%>
<%@page import="java.util.*"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <title>Login</title>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/maquetado/adminDashboard/formLog/style.css" />
  <link rel="stylesheet" href="<%=request.getContextPath()%>/maquetado/adminDashboard/formLog/estilo.css">
  
</head>

<body>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script async type="text/javascript" src="<%=request.getContextPath()%>/maquetado/adminDashboard/formLog/index.js"></script>

  <section class="wrapper">
    <div class="form signup">
      <header>Registro</header>
      <form action="#">
        <input type="text" id="nombreUsuario" placeholder="Usuario" required />
        <input type="text" id="email" placeholder="Email" required />
        <div class="input_container">
          <input type="password" id="txtPassword" class="control" placeholder="Contraseña" required>
          <span id="imgContrasena" data-activo=false><img src="https://cdn3.iconfinder.com/data/icons/show-and-hide-password/100/show_hide_password-09-256.png" class="icon"></span>
        </div>
        <input type="submit" value="Registrar" />
      </form>
    </div>

    <div class="form login">
      <header>Iniciar Sesion</header>
      <form method="post" action="/slogin">
        <input type="text" name="usuar" id="usuar" placeholder="Usuario" required />
        <div class="input_container">
          <input type="password" name = "password" id="txtPassword2" class="control" placeholder="Contraseña" required>
          <span id="imgContrasena2" data-activo=false><img src="https://cdn3.iconfinder.com/data/icons/show-and-hide-password/100/show_hide_password-09-256.png" class="icon"></span>
        </div>
        <input type="submit" value="Iniciar Sesion" />
      </form>
    </div>

    <script>
      const wrapper = document.querySelector(".wrapper"),
        signupHeader = document.querySelector(".signup header"),
        loginHeader = document.querySelector(".login header");

      loginHeader.addEventListener("click", () => {
        wrapper.classList.add("active");
      });
      signupHeader.addEventListener("click", () => {
        wrapper.classList.remove("active");
      });
    </script>
  </section>
</body>

</html>