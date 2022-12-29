package io.github.pedro.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development")
public class DevConfiguration {

    @Bean
    public CommandLineRunner executar(){
        return args -> System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
    }

}
