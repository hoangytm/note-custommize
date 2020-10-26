package com.programming.hoangpn.note.controller;

import com.programming.hoangpn.note.dto.AuthenticationResponse;
import com.programming.hoangpn.note.dto.LoginRequest;
import com.programming.hoangpn.note.dto.RefreshTokenRequest;
import com.programming.hoangpn.note.exceptions.BusinessException;
import com.programming.hoangpn.note.model.ApiResponse;
import com.programming.hoangpn.note.service.AuthService;
import com.programming.hoangpn.note.service.RefreshTokenService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
@Slf4j
public class AuthController {
    @Autowired
    private AuthService authService;
    @Autowired
    private RefreshTokenService refreshTokenService;
    @Autowired

    @GetMapping
    public String test() {
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
//                .currentRequestAttributes())
//                .getRequest();
//        String ip = getClientIpAddr(request);
//        log.info("client ip; " + ip);
        return "tuna";
    }
    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }

    @PostMapping("/refresh/token")
    public AuthenticationResponse refreshTokens(@Valid @RequestBody RefreshTokenRequest refreshTokenRequest) throws BusinessException {

        return authService.refreshToken(refreshTokenRequest);
    }

    @PostMapping("/logout")
    public ApiResponse logout(@Valid @RequestBody RefreshTokenRequest refreshTokenRequest) throws BusinessException {
        refreshTokenService.deleteRefreshToken(refreshTokenRequest.getRefreshToken());
        return ApiResponse.builder().code(200).message("logout success").build();
    }
}
