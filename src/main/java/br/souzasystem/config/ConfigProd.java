package br.souzasystem.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ConfigProd {

    @Bean(name = "applicationName")
    public String applicationName() {
        return "Mercado On-Line - Produção";
    }

    @Bean(name = "ambiente")
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Profile PROD");
        };
    }
}
