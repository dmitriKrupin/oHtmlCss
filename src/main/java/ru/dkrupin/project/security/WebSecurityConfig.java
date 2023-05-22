package ru.dkrupin.project.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Slf4j
@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        log.info("Обращаемся к фильтру допуска!");
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/", "/CSS/style.css", "/SCRIPTS/script.js")
                        .permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll()
                )
                .logout(LogoutConfigurer::permitAll);

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        log.info("Обращаемся к проверке логина и пароля!");
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("user")
                        .password("1111")
                        .roles("USER")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }
}