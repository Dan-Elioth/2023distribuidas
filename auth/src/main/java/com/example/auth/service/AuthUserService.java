package com.example.auth.service;

import com.example.auth.dto.AuthUserDto;
import com.example.auth.entity.AuthUser;
import com.example.auth.entity.TokenDto;

public interface AuthUserService {
    public AuthUser save(AuthUserDto authUserDto);

    public TokenDto login(AuthUserDto authUserDto);

    public TokenDto validate(String token);

}
