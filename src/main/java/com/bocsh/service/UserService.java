package com.bocsh.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getTellerName(Long id){

        if(id == 2222){
            return "Alice";
        }
        else {
            return "Tom";
        }
    }
}
