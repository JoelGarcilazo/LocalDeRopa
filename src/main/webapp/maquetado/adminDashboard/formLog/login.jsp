<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <title>Login</title>
  <link rel="stylesheet" href="style.css" />
  <script src="../custom-scripts.js" defer></script>
</head>

<body>
  <section class="wrapper">
    <div class="form signup">
      <header>Registro</header>
      <form action="#">
        <input type="text" id="nombreUsuario" placeholder="Usuario" required />
        <input type="text" id="email" placeholder="Email" required />
        <input type="password" id="clave" placeholder="Contraseña" required />
        <input type="submit" value="Registrar" />
      </form>
    </div>

    <div class="form login">
      <header>Iniciar Sesion</header>
      <form action="#">
        <input type="text" id="email" placeholder="Email" required />
        <input type="password" id="clave" placeholder="Contraseña" required />
        <a href="#">Olvido su contraseña?</a>
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