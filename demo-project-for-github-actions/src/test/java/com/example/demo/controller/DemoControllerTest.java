package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DemoController.class)
public class DemoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSayHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/greet"))
                .andExpect(status().isOk())
                .andExpect(content().string("hello, have a nice date."));
    }

    @Test
    public void testSayHelloToName() throws Exception {
        String name = "Alice";
        String expected = "Hello, Alice have a nice date";

        mockMvc.perform(MockMvcRequestBuilders.get("/greet/{name}", name))
                .andExpect(status().isOk())
                .andExpect(content().string(expected));
    }
}
