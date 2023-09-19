package com.unicatt.tuttiatavola.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOrigin("http://localhost:4200"); // Sostituisci con l'origine del tuo frontend Angular
        config.addAllowedMethod("*"); // Consenti tutti i metodi HTTP
        config.addAllowedHeader("*"); // Consenti tutte le intestazioni
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
