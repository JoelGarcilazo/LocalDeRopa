<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Pedidos</title>
  <link rel="stylesheet"
    href="https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0" />
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

        <a href="<%=request.getContextPath()%>/productos" >
          <span class="material-symbols-sharp">grid_view </span>
          <h3>Productos</h3>
        </a>
        <a href="<%=request.getContextPath()%>/pedidos" >
          <span class="material-symbols-sharp">receipt_long </span>
          <h3>Pedidos</h3>
        </a>
        <a href="<%=request.getContextPath()%>/agregarProducto" class="active">
          <span class="material-symbols-sharp">add </span>
          <h3>Agregar Producto</h3>
        </a>
        <a href="formLog/login.html">
          <span class="material-symbols-sharp">logout </span>
          <h3>Cerrar Sesion</h3>
        </a>

      </div>

    </aside>

    <main>
      <h1>Flower <span style="color: #986842;">.</span></h1>

      <section class="wrapper">
        <div class="form signup">
          <header style="color: #986842;">Agregar Producto</header>
          <form action="#">
            <input type="number" placeholder="ID" required />
            <input type="text" placeholder="Nombre" required />
            <input type="text" placeholder="Descripcion" required />
            <input type="number" placeholder="Stock" required />
            <input type="number" placeholder="Precio" required />
            <input type="submit" value="Agregar" />
          </form>
        </div>
      </section>

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
          <div class="profile-photo">
            <img src="images/profile-3.jpg" alt="" />
          </div>
        </div>
      </div>
    </div>
  </div>

  <script src="script.js"></script>
</body>
</html>