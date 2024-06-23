package com.example.Instructify.Security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


        private final CustomUserDetailsService customUserDetailsService;
        public SecurityConfig(CustomUserDetailsService customUserDetailsService){
            this.customUserDetailsService = customUserDetailsService;
        }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity)throws Exception{
       return httpSecurity.
                authorizeHttpRequests(auth->auth
                        .requestMatchers("/").hasRole("ADMIN")
                        .requestMatchers((HttpMethod.GET),"/AllUsers").hasAnyRole("USER","ADMIN")

                        .anyRequest().authenticated()


                )
                .userDetailsService(customUserDetailsService)
               .httpBasic(Customizer.withDefaults())
                .build();


    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
