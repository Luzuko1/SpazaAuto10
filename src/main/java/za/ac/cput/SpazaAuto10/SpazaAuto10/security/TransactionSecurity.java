package za.ac.cput.SpazaAuto10.SpazaAuto10.security;


import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@Configuration
public class TransactionSecurity extends WebSecurityConfigurerAdapter
{
    private static final String USER_ROLE = "USER";
    private static final String ADMIN_ROLE = "ADMIN";

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("Luzuko")
                .password(encoder().encode("12345"))
                .roles(USER_ROLE)
                .and()
                .withUser("lzet")
                .password(encoder().encode("54321"))
                .roles(USER_ROLE, ADMIN_ROLE);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/SpazaAuto10/owner/create/**").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET, "/SpazaAuto10/owner/getall").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.GET, "/SpazaAuto10/owner/getall/**").hasRole(ADMIN_ROLE)
                .antMatchers(HttpMethod.POST, "SpazaAuto10/**/read/**").hasRole(USER_ROLE)
                .and()
                .csrf()
                .disable()
                .formLogin();
    }

    @Bean
    public PasswordEncoder encoder() {
        return new BCryptPasswordEncoder();
    }
}
