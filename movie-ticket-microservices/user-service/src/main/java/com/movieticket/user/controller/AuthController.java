package com.movieticket.user.controller;

import com.movieticket.entity.User;
import com.movieticket.repository.UserRepository;
import com.movieticket.security.JwtUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:4200")
public class AuthController {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder encoder =
            new BCryptPasswordEncoder();

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {

        user.setPassword(
                encoder.encode(user.getPassword())
        );

        userRepository.save(user);

        return "User Registered Successfully";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        Optional<User> existingUser =
                userRepository.findByUsername(
                        user.getUsername()
                );

        if (existingUser.isPresent()) {

            if (encoder.matches(
                    user.getPassword(),
                    existingUser.get().getPassword()
            )) {

                return JwtUtil.generateToken(
                        user.getUsername()
                );
            }
        }

        return "Invalid Username or Password";
    }
}