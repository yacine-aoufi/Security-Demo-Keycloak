package net.yassine.demokeycloak.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;



@EnableWebSecurity
@Configuration
public class Securityconf {

@Autowired
    private JwtAuthConverter jwtAuthConverter;
    

@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
 http.csrf(csrf -> csrf.disable());
 http.authorizeHttpRequests(auth -> auth.requestMatchers("/users/**").hasRole("USER"));
 http.sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
 http.authorizeHttpRequests(ath->ath.anyRequest().authenticated());
http.oauth2ResourceServer(o->o.jwt(j->j.jwtAuthenticationConverter(jwtAuthConverter))) ;
return http.build();

}














}
