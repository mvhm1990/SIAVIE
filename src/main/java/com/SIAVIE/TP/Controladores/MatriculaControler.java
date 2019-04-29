package com.SIAVIE.TP.Controladores;
import com.SIAVIE.TP.Entity.Pais;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.SIAVIE.TP.Modelo.PaisModel;
import com.SIAVIE.TP.Servicios.PaisService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Controller
@RequestMapping("/MatriculaDirecta")
public class MatriculaControler {

    public static final String EXAMPLE_VIEW1 = "Matricula";

    @Autowired
    @Qualifier("paisServiceImpl")
    private PaisService paisService;
   
    @GetMapping("/")
    public String redirectLogin(){
        List<Pais> app= new ArrayList<>();
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        app=paisService.listaPaises();
      System.out.println(""+app.toString());
    return "Matricula";
    }
}
