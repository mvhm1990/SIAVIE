package com.SIAVIE.TP.Componentes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component("requestTimeInterceptor")
public class RequestTimeInterceptor extends HandlerInterceptorAdapter{

    private static final Log LOG = LogFactory.getLog(RequestTimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest hsr, HttpServletResponse hsr1, Object o) throws Exception {
         hsr.setAttribute("startTime", System.currentTimeMillis());
         return true;
    }
    
    @Override
    public void afterCompletion(HttpServletRequest hsr, HttpServletResponse hsr1, Object o, Exception excptn) throws Exception {
        long starTime = (long)hsr.getAttribute("startTime");
        LOG.info("--REQUEST URL: '" + hsr.getRequestURL().toString() + "' -- TOTAL TIME: '" + (System.currentTimeMillis() - starTime) + "' ms");     
    }
}
