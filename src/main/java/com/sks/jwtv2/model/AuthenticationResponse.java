package com.sks.jwtv2.model;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    private  static  final  long serialVersionUID = -5581189789155142754L;

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}
