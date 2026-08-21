package com.dexenross.springboot_course.controller;

import com.dexenross.springboot_course.dto.EmployeeResponse;
import com.dexenross.springboot_course.service.EmployeeService;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private EmployeeService employeeService;

    @Test
    void shouldCreateEmployee() throws Exception {

        EmployeeResponse response =
                new EmployeeResponse(
                        1L,
                        "Emilio",
                        1L,
                        "Backend"
                );

        when(employeeService.create(
                "Emilio",
                1L
        )).thenReturn(response);

        mockMvc.perform(
                post("/api/employees")
                        .contentType(
                                MediaType.APPLICATION_JSON
                        )
                        .content("""
                            {
                                "name": "Emilio",
                                "departmentId": 1
                            }
                            """)
        )
        .andExpect(
                status().isCreated()
        )
        .andExpect(
                jsonPath("$.name")
                        .value("Emilio")
        )
        .andExpect(
                jsonPath("$.departmentName")
                        .value("Backend")
        );
    }

    @Test
    void shouldReturn400WhenNameIsBlank()
            throws Exception {

        mockMvc.perform(
                post("/api/employees")
                        .contentType(
                                MediaType.APPLICATION_JSON
                        )
                        .content("""
                            {
                                "name": "",
                                "departmentId": 1
                            }
                            """)
        )
        .andExpect(
                status().isBadRequest()
        );
        
        verify(
            employeeService,
            never()
        ).create(anyString(), anyLong());
    }
}
