package pe.dhexsoft.api_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.dhexsoft.api_rest.service.GreetingService;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    //ahora si lo quieres hacer con el autowired. seria de esta forma, agregando tambien tu "@qualifier"
    @Autowired
    @Qualifier("greetingServiceImpl2")
    private GreetingService greetingService;


    @GetMapping()
    public String greet(){
        return greetingService.greet();
    }




}
