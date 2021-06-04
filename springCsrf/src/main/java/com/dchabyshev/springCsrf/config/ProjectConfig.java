package com.dchabyshev.springCsrf.config;


import com.dchabyshev.springCsrf.security.CsrfTokenLoggerFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;

@Configuration
@EnableWebSecurity
public class ProjectConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        super.configure(http);
      //  http.csrf().disable();// NEVER DONT DO THIS ;)
        /**
         * Setting csrf with Castomaizer  (we may ignored some endpoints........)
         */
        http.csrf(c->{
                 c.ignoringAntMatchers("/csrfdisable/**");
        });

        //CsrfTokenRepozitory - vechile castomize work with csrf


        /**
         * add my filter in chain filters
         */
        http.addFilterAfter(new CsrfTokenLoggerFilter(),
                CsrfFilter.class);




    }





}
