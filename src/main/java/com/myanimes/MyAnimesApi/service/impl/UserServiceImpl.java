package com.myanimes.MyAnimesApi.service.impl;

import com.myanimes.MyAnimesApi.entity.Role;
import com.myanimes.MyAnimesApi.entity.Users;
import com.myanimes.MyAnimesApi.repository.RoleRepository;
import com.myanimes.MyAnimesApi.repository.UserRepository;
import com.myanimes.MyAnimesApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public void insert(Users users) {
        Users objUser = users;
        objUser.setPassword(passwordEncoder.encode(objUser.getPassword()));
        Role role = new Role();
        role.setAuthority("ROLE_USER");
        role = roleRepository.save(role);
        objUser = userRepository.save(objUser);
    }
}
