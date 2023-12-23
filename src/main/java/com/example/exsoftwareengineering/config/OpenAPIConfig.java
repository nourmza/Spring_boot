package com.example.exsoftwareengineering.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }
    public Info infoAPI() {
        return new Info().title("SpringDoc-ExSoftware")
                .description("ExSoftwareEng")
                .contact(contactAPI());
    }
    public Contact contactAPI() {
        return new Contact().name("Equipe ASI II")
                .email("chahnez.sardouk@esprit.tn")
                .url("https://www.linkedin.com/in/**********/");
    }


/*    @Bean
    public GroupedOpenApi productPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Contrat Management API")
                .pathsToMatch("/contrat/**")
                //.pathsToExclude("**")
                .build();
    }*/


}
