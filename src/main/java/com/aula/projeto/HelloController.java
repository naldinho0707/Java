package com.aula.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  //Marcar como controller e adiciona o import acima

public class HelloController {

    @GetMapping("/")  //Adicionar rota (GetMapping: Método do html)
    public String index(){
        return "index"; // vai procurar a página index
    }

    @GetMapping("/p1") 
    public String pagina1(){
        return "p1";
    }

    @GetMapping("/p2") 
    public String pagina2(){
        return "p2";
    }
    
}
