package com.example.LeanDevSecOps;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// This annotation configures the test to only load the web layer,
// specifically the DemoController, making the test fast and focused.
@WebMvcTest(DemoController.class)
class DemoControllerTest {

    // MockMvc is autowired to simulate HTTP requests without starting a full server.
    @Autowired
    private MockMvc mockMvc;

    @Test
    void helloEndpointShouldReturnCorrectString() throws Exception {
        // Perform a GET request to the root path ("/")
        this.mockMvc.perform(get("/"))
            // Expect the HTTP status to be 200 (OK)
            .andExpect(status().isOk())
            // Expect the body content to match the exact string returned by the controller
            .andExpect(content().string("Hello, this is the main application!"));
    }
}