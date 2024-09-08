package com.unirating.login;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.unirating.user.User;
import com.unirating.user.UserRepository;

@Service
public class LoginService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String login(LoginRequest loginRequest){

        Optional<User> userOptional = userRepository.findByEmail(loginRequest.getEmail());
        
        if(userOptional.isPresent()){
            User user = userOptional.get();
            if(!user.isEnabled()){
                throw new RuntimeException("please verify your email");
            }
            if (passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
                return "login successful";
            }
        }
        throw new RuntimeException("Invalid email or password");
    }
    
}
