package com.SIAVIE.TP.Controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/Prueba")
public class Ejemplo {

    public static final String EXAMPLE_VIEW1 = "login";

    @GetMapping("/")
    public ModelAndView request1(@RequestParam(name = "nm", required = false, defaultValue = "Incorrecto") String nombre) {
        ModelAndView mav = new ModelAndView(EXAMPLE_VIEW1);
        mav.addObject("nm_in_model", nombre);
        return mav;
    }

    @GetMapping("/{nm}")
    public ModelAndView request2(@PathVariable("nm") String nombre) {
        ModelAndView mav = new ModelAndView(EXAMPLE_VIEW1);
        mav.addObject("nm_in_model", nombre); 
        return mav;
    }
}
