$(function() {
  


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
