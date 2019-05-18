package com.SIAVIE.TP.Controladores;

import com.SIAVIE.TP.Servicios.impl.ComunicadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/indice")
public class ComunicadoController {

    @Autowired
    @Qualifier("ComunicadoServiceImpl")
    ComunicadoServiceImpl ComunicadoServiceImpl;

    @GetMapping("/listarcomunicados")
    public ModelAndView listarcomunicados() {
        ModelAndView modelo = new ModelAndView("indexprueba");
        modelo.addObject("listacomunicados", ComunicadoServiceImpl.listarComunicados());
        modelo.addObject("comunicado", ComunicadoServiceImpl.obtenerEncabezado("perro"));
        return modelo;
    }

    @GetMapping("/listar")
    public ModelAndView listar() {
        ModelAndView modelo = new ModelAndView("indexprueba");
        return modelo;
    }

//    public static final String EXAMPLE_VIEW2 = "EjemploListar";
//    @Autowired
//    @Qualifier("ComunicadoServiceImpl")
//    private ComunicadoService comunicadoService;
//    @GetMapping("/exampleString")
//    public String exampleString(Model model) {
//        //   model.addAttribute("person",new Person("Jon",23));
//        model.addAttribute("comunicado", getComunicado());
//        return EXAMPLE_VIEW2;
//    }
//
//    // Al inicio entra x aca
//    @GetMapping("/")
//    public ModelAndView redirectLogin() {
//        ModelAndView modal = new ModelAndView("EjemploListar");
//        List<Comunicado> app = new ArrayList<>();
//        List<Comunicado> app2 = comunicadoService.listarComunicados();
//        System.out.println("--------------------------------------------------------------------------------------------------------------------");
//        app = comunicadoService.listarComunicados();
//        System.out.println("" + app.toString());
//        System.out.println("Cantidad de comunicados: " + app2.size());
//        modal.addObject("comunicados", app2);
//        return modal;
//    }
//
//    // Al inicio entra x aca
//    @GetMapping("/ejemplo")
//    public ModelAndView ejemplo() {
//        ModelAndView modal = new ModelAndView("EjemploListar");
//
//        List<Comunicado> app2 = comunicadoService.listarComunicados();
//
//        System.out.println("Estoy en el ejemplo");
//        modal.addObject("comunicados", app2);
//        return modal;
//    }
//
//    private List<Comunicado> getComunicado() {
//        List<Comunicado> comunicado = new ArrayList<>();
//// comunicado.add(new Comunicado(0, 0, 0,"hola","entra", (byte)4));
////comunicado.add(new Comunicado(1, 2, 1,"hola","entra", (byte)4));
//        return comunicado;
//    }
}
