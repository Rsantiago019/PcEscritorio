package com.santi.curso.springboot.webapp.springboot_web.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController 
{    
    @GetMapping  // Es para una peticion que  es atraves de una URL
    public String details(Model model)
    {
        model.addAllAttributes(null)
        return "/details";
    }
}


// Metodo POST  es cuando enviamos informacion de datos en un formulario o 
// si queremos consumir una API y queremos enviar informacion mediante un POST