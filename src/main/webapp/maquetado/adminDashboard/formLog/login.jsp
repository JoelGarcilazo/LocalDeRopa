<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="local.domain.cotroller.LoginController"%>
  <%@page import="local.domain.Login"%>
  <%@page import="local.domain.dao.AbstractLoginDaoImpl"%>
  <%@page import="java.util.*"%>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <title>Login</title>
  <link rel="stylesheet" href="style.css" />
</head>

<body>
  <section class="wrapper">
    <div class="form signup">
      <header>Registro</header>
      <form action="#">
        <input type="text" id="nombreUsuario" placeholder="Usuario" required />
        <input type="text" id="email" placeholder="Email" required />
        <input type="password" id="clave" placeholder="ContraseÃ±a" required />
        <input type="submit" value="Registrar" />
      </form>
    </div>

    <div class="form login">
      <header>Iniciar Sesion</header>
      <form method="post" action="/slogin">
        <input type="text" name="usuar" id="usuar" placeholder="usuario" required />
        <input type="password" name="password" id="password" placeholder="ContraseÃ±a" required />
        <a href="#">Olvido su contraseÃ±a?</a>
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