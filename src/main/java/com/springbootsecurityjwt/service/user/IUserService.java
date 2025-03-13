package com.springbootsecurityjwt.service.user;


import com.springbootsecurityjwt.model.User;
import com.springbootsecurityjwt.service.IGenericService;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserService extends IGenericService<User> {
    UserDetails loadUserByUsername(String username);
    User findByUsername(String username);
}
