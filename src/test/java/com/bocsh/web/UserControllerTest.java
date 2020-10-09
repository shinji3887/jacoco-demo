package com.bocsh.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    //获取管理员用户
    void getAdminUser() throws Exception {

        mvc.perform(get("/users/1111"))
                .andExpect(status().isOk())
                .andExpect(content().string("myUser"));

    }

    @Test
    //获取普通用户
    void getNormalUser() throws Exception {

        mvc.perform(get("/users/1122"))
                .andExpect(status().isOk())
                .andExpect(content().string("Tom"));

    }

    @Test
        //获取普通用户
    void getSpeclUser() throws Exception {

        mvc.perform(get("/users/2222"))
                .andExpect(status().isOk())
                .andExpect(content().string("Alice"));

    }
}