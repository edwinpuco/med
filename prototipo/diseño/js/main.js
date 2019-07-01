$(function() {
  "use strict";
  document.addEventListener('DOMContentLoaded', function(){
    var map = L.map('mapa').setView([51.505, -0.09], 13);

  L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
      attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
  }).addTo(map);

  L.marker([51.5, -0.09]).addTo(map)
      .bindPopup('A pretty CSS3 popup.<br> Easily customizable.')
      .openPopup();

  });




  var windowHeight=$(window).height();
  var barraAltura=$('.barra').innerHeight();
  //console.log(windowHeight);
  //console.log(barraAltura);
  $(window).scroll(function(){
    var scroll=$(window).scrollTop();
    //console.log(scroll);
    if(scroll<windowHeight){
      $('.barra').addClass('fixed');
      $('body').css({'margin-top':barraAltura+'px'});
      //console.log('altura de pantalla rebasada')
      //$('.barra').removeClass('fixed');
      //$('body').css({'margin-top':'0px'});
    }else{
      //console.log('aun no')

    }
  });
  $('.menu-movil').on('click',function(){
    $('.navegacion-principal').slideToggle();
  });

});
