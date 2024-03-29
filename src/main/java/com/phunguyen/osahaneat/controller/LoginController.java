package com.phunguyen.osahaneat.controller;

import com.phunguyen.osahaneat.payload.ResponseData;
import com.phunguyen.osahaneat.payload.request.SignUpRequest;
import com.phunguyen.osahaneat.service.LoginService;
import com.phunguyen.osahaneat.service.imp.LoginServiceImp;
import com.phunguyen.osahaneat.utils.JwtUtilsHelper;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Encoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.crypto.SecretKey;
import java.util.Base64;

//@CrossOrigin("*")         instead of spring security

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginServiceImp loginServiceImp;

    @Autowired
    JwtUtilsHelper jwtUtilsHelper;
    @PostMapping("/signin")
    public ResponseEntity<?> signin(@RequestParam String username, @RequestParam String password){
        ResponseData responseData = new ResponseData();
//        SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS256);
//        String encrypted = Encoders.BASE64.encode(secretKey.getEncoded());
//        System.out.println(encrypted);
        if(loginServiceImp.checkLogin(username,password)){
            String token = jwtUtilsHelper.generateToken(username);
            responseData.setData(token);
        }else{
            responseData.setData("");
            responseData.setSuccess(false);
        }

        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }
    @PostMapping("/signup")
    public ResponseEntity<?> signup(@RequestBody SignUpRequest signUpRequest){
        ResponseData responseData = new ResponseData();
        responseData.setData(loginServiceImp.addUser(signUpRequest));
        return new ResponseEntity<>(responseData, HttpStatus.OK);
    }

}
