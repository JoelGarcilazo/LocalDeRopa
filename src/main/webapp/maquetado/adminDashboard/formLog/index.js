$("#imgContrasena").click(function () {

    var control = $(this);
    var estatus = control.data('activo');
  
    var image = control.find('img');
    if (estatus == false) {
    
      control.data('activo', true);
      $(image).attr('src', 'https://cdn3.iconfinder.com/data/icons/show-and-hide-password/100/show_hide_password-10-256.png');
      $("#txtPassword").attr('type', 'text');
    }
    else {
    
      control.data('activo', false);
      $(image).attr('src', 'https://cdn3.iconfinder.com/data/icons/show-and-hide-password/100/show_hide_password-09-256.png');
      $("#txtPassword").attr('type', 'password');
    }
  });

$("#imgContrasena2").click(function () {

    var control = $(this);
    var estatus = control.data('activo');
  
    var image = control.find('img');
    if (estatus == false) {
    
      control.data('activo', true);
      $(image).attr('src', 'https://cdn3.iconfinder.com/data/icons/show-and-hide-password/100/show_hide_password-10-256.png');
      $("#txtPassword2").attr('type', 'text');
    }
    else {
    
      control.data('activo', false);
      $(image).attr('src', 'https://cdn3.iconfinder.com/data/icons/show-and-hide-password/100/show_hide_password-09-256.png');
      $("#txtPassword2").attr('type', 'password');
    }
  });