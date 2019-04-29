package com.SIAVIE.TP.Configuracion;
import com.SIAVIE.TP.Componentes.RequestTimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMVCConfiguracion extends WebMvcConfigurerAdapter {

    @Autowired
    @Qualifier("requestTimeInterceptor")
    private RequestTimeInterceptor requesTimeinterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(requesTimeinterceptor); 
    }
    
}
