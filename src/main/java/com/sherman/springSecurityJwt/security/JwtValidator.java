package com.sherman.springSecurityJwt.security;

import com.sherman.springSecurityJwt.model.JwtUser;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	private String secret = "mysecret";

    public JwtUser validate(String token) {
        
        JwtUser jwtUser = null;

        try{
            Claims body = (Claims) Jwts.parser()
                        .setSigningKey(secret)
                        .parseClaimsJws(token)
                        .getBody();

            jwtUser = new JwtUser();

            jwtUser.setUserName(body.getSubject());
            jwtUser.setId(Long.parseLong((String)body.get("userId")));
            jwtUser.setRole((String)body.get("role"));
        }
        catch (Exception e){
            System.out.println(e);
        }

        return jwtUser;
	}
    
}
