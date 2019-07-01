(function() {
  "use strict";
  document.addEventListener('DOMContentLoaded', function(){

    var map = L.map('mapa').setView([51.505, -0.09], 13);

  L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
  }).addTo(map);

  L.marker([51.5, -0.09]).addTo(map)
      .bindPopup('A pretty CSS3 popup.<br> Easily customizable.')
      .openPopup();


    //console.log("listo");
    var nombreUno=document.getElementById('nombre1');
    var nombreDos=document.getElementById('nombre2');
    var apellidoUno=document.getElementById('apellido1');
    var apellidoDos=document.getElementById('apellido2');
    var fecha=document.getElementById('fechaNacimiento');
    var celular=document.getElementById('telefono');
    var email=document.getElementById('correo');
    var pass=document.getElementById('password');
    var repass=document.getElementById('confirmacion');
    var errorDiv=document.getElementById('error');
    if(nombreUno=document.getElementById('nombre1')){


    nombreUno.addEventListener('blur',validarCampos);
    nombreDos.addEventListener('blur',validarCampos);
    apellidoUno.addEventListener('blur',validarCampos);
    apellidoDos.addEventListener('blur',validarCampos);
    email.addEventListener('blur',validarCampos);
    email.addEventListener('blur',validarEmail);
    function validarEmail(){
      if(this.value.indexOf('@')>-1){
        errorDiv.style.display='none';
        this.style.border='1px solid #cccccc';
      }else{
        errorDiv.style.display='block';
        errorDiv.innerHTML='ESTE CAMPO DEBE CONTENER @';
        this.style.border='1px solid red';
        errorDiv.style.border='1px solid red';
      }
    }
    function validarCampos(){
      if(this.value==''){
        errorDiv.style.display='block';
        errorDiv.innerHTML='ESTE CAMPO ES OBLIGATORIO';
        this.style.border='1px solid red';
        errorDiv.style.border='1px solid red';
      }else{
        errorDiv.style.display='none';
        this.style.border='1px solid #cccccc';
      }
    }
    }
  });
})();
