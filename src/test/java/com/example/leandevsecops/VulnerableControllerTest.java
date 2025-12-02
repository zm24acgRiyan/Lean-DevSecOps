package com.example.leandevsecops;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(VulnerableController.class)
public class VulnerableControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testInsecureEndpoint() throws Exception {
        mockMvc.perform(get("/insecure").param("username", "admin"))
               .andExpect(status().isOk());
    }
}