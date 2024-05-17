package com.tpe.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data//--->getter,setter,cons.,to str.,hashcode,equals vb. her şeyi getirir.
// uygulamayı biraz yavaşlatır, karşılaştırma yapılmayacaksa kullanılmamalı
public class LoginRequest {

    @NotBlank
    private String userName;

    @NotBlank
    private String password;
}