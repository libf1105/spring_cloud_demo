package com.accenture.odc.microservice.demo.configuration;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@EnableWebSecurity
@Configuration
public class DemoWebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().userDetailsService(userDetailsServiceBean()).authorizeRequests().anyRequest().authenticated().and().formLogin();
		// .antMatchers("/proxy.stream", "/hystrix.stream",
		// "/refresh").permitAll().anyRequest().authenticated().and()
		// .logout().and().httpBasic();
	}

	@Override
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return new UserDetailsService() {

			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
				String password = username;
				authorities.add(new GrantedAuthority() {

					private static final long serialVersionUID = 1L;

					@Override
					public String getAuthority() {
						return "USER";
					}
				});
				return new User(username, password, true, true, true, true, authorities);
			}
		};
	}

}
