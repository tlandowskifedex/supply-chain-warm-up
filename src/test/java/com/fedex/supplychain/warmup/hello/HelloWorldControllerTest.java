package com.fedex.supplychain.warmup.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class HelloWorldControllerTest {

    @Autowired
    protected MockMvc mvc;

    @Test
    void should_return_hello_world_message() throws Exception {
        // when
        ResultActions result = mvc.perform(
                get("/hello")
        );

        // then
        result.andExpect(
                status().isOk()
        ).andExpect(
                jsonPath("$.message").value("Hello world")
        );
    }
}