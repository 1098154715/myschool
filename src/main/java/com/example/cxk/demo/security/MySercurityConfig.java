package com.example.cxk.demo.security;


/**
 * @author cxk
 * @date 2020/8/5 15:40
 */

public class MySercurityConfig {

   /* @Override
    protected void configure(HttpSecurity http) throws Exception {
        // super.configure(http);
        // 定制请求授权的规则
        http.authorizeRequests().antMatchers("/").permitAll()
                .antMatchers("/security/level1/**").hasRole("VIP1")
                .antMatchers("/security/level2/**").hasRole("VIP2")
                .antMatchers("/security/level3/**").hasRole("VIP3");
        http.formLogin();
    }
    // 自定义认证规则
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        super.configure(auth);
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("c").password("123456").roles("VIP1")
                .and()
                .withUser("x").password("123456").roles("VIP1", "VIP2")
                .and()
                .withUser("k").password("123456").roles("VIP1", "VIP2", "VIP3");
    }*/

}