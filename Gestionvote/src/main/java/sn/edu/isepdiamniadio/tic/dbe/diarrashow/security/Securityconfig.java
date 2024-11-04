package sn.edu.isepdiamniadio.tic.dbe.diarrashow.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class Securityconfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
                .authorizeRequests
                        (authorizeRequests -> {
                            authorizeRequests.requestMatchers(HttpMethod.GET, "/presidentassemblees").permitAll()
                                    .requestMatchers(HttpMethod.POST, "/Admin").hasRole("Admin")

                                    .requestMatchers("/vote").permitAll()
                                    .requestMatchers("/auth/**").permitAll()
                                    .requestMatchers("/ping").permitAll()
                                    .anyRequest().authenticated();
                        });
        return http.build();
    }
}
