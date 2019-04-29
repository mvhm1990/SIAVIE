package com.SIAVIE.TP.Controladores;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
//import com.SIAVIE.TP.Modelo.MatriculaModel;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/Prueba2")
public class Ejemplo2 {
    public static final String FORM_VIEW = "form";
    public static final String RESULT_VIEW = "ejemplo";
    
//    @GetMapping("/")
//    public RedirectView redirect(){
//        return new RedirectView("/Prueba2/");
//    }
   
//    @GetMapping()
//    public String showForm(Model model){
//        model.addAttribute("persona", new MatriculaModel());
//        return FORM_VIEW;
//    }
    
//    @PostMapping("/addPersona")
//    public ModelAndView añadirPersona(@Valid @ModelAttribute("persona") MatriculaModel persona, BindingResult bindingResult){
//       ModelAndView mav = new ModelAndView();
//        if (bindingResult.hasErrors()){
//           mav.setViewName(FORM_VIEW);
//       }
//       else{
//           mav.setViewName(RESULT_VIEW);
//           mav.addObject("persona", persona);
//       }
//       return mav;
//    }
}
