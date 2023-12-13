package com.example.authenticationspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.authenticationspring.repositories.UserRepository;

/* This class is responsible for implemeting the UserDetailsService interface. 
 *   It retrieves user details using the injected 'UserRepository' when Spring Security needs to
 * authenticaticate and load user details during the login/authentication process
 */
@Service
public class AuthorizationService implements UserDetailsService{
    @Autowired
    UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findByLogin(username);
    }
}
