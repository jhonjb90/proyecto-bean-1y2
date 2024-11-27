package pe.dhexsoft.api_rest.service.impl;

import org.springframework.stereotype.Service;
import pe.dhexsoft.api_rest.service.GreetingService;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greet() {
        return "salundando desde la primera implementacion";
    }
}
