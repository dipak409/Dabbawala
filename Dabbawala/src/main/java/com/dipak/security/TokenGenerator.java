package com.dipak.security;

import java.util.Map;

import com.dipak.model.Login;

public interface TokenGenerator {
	  Map<String, String> generateToken(Login login);
}
