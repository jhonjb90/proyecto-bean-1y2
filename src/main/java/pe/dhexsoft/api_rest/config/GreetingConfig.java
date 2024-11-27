package pe.dhexsoft.api_rest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pe.dhexsoft.api_rest.service.GreetingService;

@Configuration
public class GreetingConfig {

    @Bean
    @Primary
    public GreetingService primaryGreetingService(){
        return() -> "Hola desde el primer metodo";
    }

    @Bean
    public GreetingService SecondaryGreetingService(){
        return() -> "Hola desde el segundo metodo";
    }

}
