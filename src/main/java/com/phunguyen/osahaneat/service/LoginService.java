package com.phunguyen.osahaneat.service;

import com.phunguyen.osahaneat.dto.UserDTO;
import com.phunguyen.osahaneat.entity.Roles;
import com.phunguyen.osahaneat.entity.Users;
import com.phunguyen.osahaneat.payload.request.SignUpRequest;
import com.phunguyen.osahaneat.repository.UserRepository;
import com.phunguyen.osahaneat.service.imp.LoginServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService implements LoginServiceImp {
    @Autowired
    //            @Qualifier("tên bean") - trường hợp có nhiều class cùng tên trên container
    UserRepository userRepository;

    @Override
    public List<UserDTO> getAllUser() {
        List<Users> listUser = userRepository.findAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        for (Users user : listUser) {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(user.getId());
            userDTO.setUserName(user.getUserName());
            userDTO.setPassword(user.getPassword());
            userDTO.setFullName(user.getFullName());
            userDTO.setCreatedDate(user.getCreatedDate());
            userDTOList.add(userDTO);
        }
        return userDTOList;
    }

    @Override
    public boolean checkLogin(String username, String password){

        List<Users> listUser = userRepository.findByUserNameAndPassword(username, password);
        return listUser.size() > 0;
    }

    @Override
    public boolean addUser(SignUpRequest signUpRequest) {
        Users users = new Users();
        Roles roles = new Roles();
        roles.setId(signUpRequest.getRoleId());
        users.setFullName(signUpRequest.getFullName());
        users.setUserName(signUpRequest.getEmail());
        users.setPassword(signUpRequest.getPassword());
        users.setRoles(roles);
        try {
            userRepository.save(users);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}

