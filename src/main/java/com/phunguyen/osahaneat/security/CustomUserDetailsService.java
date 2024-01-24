package com.phunguyen.osahaneat.security;

import com.phunguyen.osahaneat.entity.Users;
import com.phunguyen.osahaneat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users users = userRepository.findByUserName(username);
        if (users == null){
            throw new UsernameNotFoundException("User not found with username: "+ username);
        }
        return new User(username, users.getPassword(), new ArrayList<>()) ;
    }

}
