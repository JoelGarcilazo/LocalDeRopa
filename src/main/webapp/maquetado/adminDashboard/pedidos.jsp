<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Pedidos</title>
  <link rel="stylesheet"
    href="https://fonts.googleapis.com/css2?family=Material+Symbols+Sharp:opsz,wght,FILL,GRAD@48,400,0,0" />
  <link rel="stylesheet" href="style.css">
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

        <a href="productos.jsp" >
          <span class="material-symbols-sharp">grid_view </span>
          <h3>Productos</h3>
        </a>
        <a href="#" class="active">
          <span class="material-symbols-sharp">receipt_long </span>
          <h3>Pedidos</h3>
        </a>
        <a href="agregarProducto.jsp">
          <span class="material-symbols-sharp">add </span>
          <h3>Añadir Producto</h3>
        </a>
        <a href="#">
          <span class="material-symbols-sharp">logout </span>
          <h3>Cerrar Sesion</h3>
        </a>

      </div>

    </aside>

    <main>
      <h1>Flower.</h1>

      <div class="recent_order">
        <h2>Pedidos</h2>
        <table>
          <thead>
            <tr>
              <th>ID Pedido</th>
              <th>Descripcion</th>
              <th>Precio</th>
              <th>Estado</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td>1</td>
              <td>Mini USB</td>
              <td>4563</td>
              <td><a href="" class="warning">Pendiente</a></td>

            </tr>
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