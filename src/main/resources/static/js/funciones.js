$(document).ready(function () {  
});

(function ($) {
    "use strict";


    $('#btnconsultar').click(function (evento) {
        evento.preventDefault();
        var dnicliente = $("#dnicliente").val();

        if (dnicliente.length < 8) {
            alert("Ingrese un dni valido");
            return;
        }

        var tabla = {dni: $("#dnicliente").val()};

        $.ajax({
            type: "POST",
            dataType: 'json',
            contentType: "application/json",
            url: "/apis/consultarcliente", 
            data: JSON.stringify(tabla),
            success: function (usuario) {

                $("#nombres").val(usuario.nombres);
                $("#apellidos").val(usuario.apellidos);
                $("#sesion").val(usuario.sesion);
                $("#clase").val(usuario.clase);
                $("#dni").val(usuario.dni);
                $("#referido").val(usuario.referido);
                if (usuario.activo) {
                    $("#activo").val("Activo");
                    $("#btnasistencia").attr("disabled", false);
                } else {
                    $("#activo").val("Inactivo");
                }

            },
            error: function (response) {
                $("#divasistencia").prepend('<div  id="mensajeeror" class="col-sm-12 animated fadeIn">' +
                        '<div  class="alert  alert-danger alert-dismissible fade show" role="alert">' +
                        '<span class="badge badge-pill badge-danger">Error</span> Cliente no registrado' +
                        '<button type="button" class="close" data-dismiss="alert" aria-label="Close">' +
                        '<span aria-hidden="true">&times;</span></button></div>');
                $("#nombres").val("");
                $("#apellidos").val("");
                $("#sesion").val("");
                $("#clase").val("");
                $("#dni").val("");
                $("#fechadeafiliacion").val("");
                $("#sesion").val("");
                $("#clase").val("");
                $("#activo").val("");
                $("#referido").val("");
                $("#btnasistencia").attr("disabled", true);
            }
        });
        cargarasistencia();
    });
   
})(jQuery);
