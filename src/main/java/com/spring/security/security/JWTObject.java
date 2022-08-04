package com.spring.security.security;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class JWTObject {
    private String subject; //nome de usuário
    private Date issueAt; //data de criação do token
    private Date expiration; //data de expiração do token
    private List<String> roles; //perfis de acesso
}
