package org.sabery.knowledge.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;

/**
 * 用于设置 Web 应用程序安全措施的安全配置类。
 * 这个类使用了 @Configuration 和 @EnableWebSecurity 注解，这表明它是一个专门用于启用和配置 Web 安全的 Spring 配置类。
 * <p>
 * 这个类的主要目的是定义一个安全过滤器链，该过滤器链应用了各种安全设置，例如跨站请求伪造（CSRF）保护、请求授权、HTTP 基本身份验证以及表单登录配置。这些设置确保所有传入的请求都经过身份验证，并且该应用程序能够抵御常见的 Web 攻击。
 */
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		http.csrf(Customizer.withDefaults()).authorizeHttpRequests(authorize -> authorize.anyRequest().authenticated()).httpBasic(Customizer.withDefaults()).formLogin(Customizer.withDefaults());
//		return http.build();
//	}
//
//}