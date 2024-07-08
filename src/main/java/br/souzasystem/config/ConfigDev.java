package br.souzasystem.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Development
public class ConfigDev {

    @Bean(name = "applicationName")
    public String applicationName() {
        return "Mercado On-Line - Desenvolvimento";
    }

    @Bean(name = "ambiente")
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Profile DEV");
        };
    }
}
