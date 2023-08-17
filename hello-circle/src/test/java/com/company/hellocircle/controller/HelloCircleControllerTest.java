package com.company.hellocircle.controller;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HelloCircleControllerTest {
    public MockMvc mockMvc;

    @Test
    public void shouldReturnAnswer() throws Exception {
        // arrange and act
        mockMvc.perform(get("/answer"))
                .andDo(print())
                .andExpect(status().isOk())
                // assert
                .andExpect(content().string("The answer is 42!"));
    }
}
