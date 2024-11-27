package pe.dhexsoft.api_rest.service.impl;

import org.springframework.stereotype.Service;
import pe.dhexsoft.api_rest.service.GreetingService;

@Service
public class GreetingServiceImpl2 implements GreetingService {
    @Override
    public String greet() {
        return "saludando desde la segunda implementacion";
    }
}
