package pe.dhexsoft.api_rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.dhexsoft.api_rest.service.GreetingService;
import pe.dhexsoft.api_rest.service.impl.GreetingServiceImpl2;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    //ahora si lo quieres hacer con el autowired. seria de esta forma, agregando tambien tu "@qualifier"
    @Autowired
    @Qualifier("greetingServiceImpl")
    private GreetingService greetingService;


    private final GreetingService greetingService2;
    public GreetingController(@Qualifier("greetingServiceImpl2") GreetingService greetingService2) {
        this.greetingService2 = greetingService2;
    }


    @GetMapping("/gt1")
    public String greet1(){
        return greetingService.greet();
    }

    @GetMapping("/gt2")
    public String greet2(){
        return greetingService2.greet();
    }




}
