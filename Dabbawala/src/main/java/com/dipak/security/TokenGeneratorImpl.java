package com.dipak.security;

import org.springframework.stereotype.Service;

import com.dipak.model.Login;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class TokenGeneratorImpl implements TokenGenerator {
	

	@Override
	public Map<String, String> generateToken(Login login) {
		// TODO Auto-generated method stub
		String jwtToken = null;
        jwtToken = Jwts.builder().setSubject(login.getEmail())
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "mysecret").compact();

        Map<String, String> map = new HashMap<>();
        map.put("token", jwtToken);
        map.put("message", "User Successfully logged in");
        return map;
	}
}
