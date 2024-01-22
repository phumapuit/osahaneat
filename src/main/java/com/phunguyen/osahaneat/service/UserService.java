package com.phunguyen.osahaneat.service;

import com.phunguyen.osahaneat.dto.UserDTO;
import com.phunguyen.osahaneat.entity.Users;
import com.phunguyen.osahaneat.repository.UserRepository;
import com.phunguyen.osahaneat.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService implements UserServiceImp {

    @Autowired
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
}
