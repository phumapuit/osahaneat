package com.phunguyen.osahaneat.service.imp;

import com.phunguyen.osahaneat.dto.UserDTO;
import com.phunguyen.osahaneat.payload.request.SignUpRequest;

import java.util.List;

public interface LoginServiceImp {
    List<UserDTO> getAllUser();
    boolean checkLogin(String username, String password);

    boolean addUser(SignUpRequest signUpRequest);
}
