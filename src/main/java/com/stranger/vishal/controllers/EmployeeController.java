package com.stranger.vishal.controllers;

//operation
//GET /employees
//POST /employees
//DELETE /employees/{id}


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @GetMapping(path = "/employees")
    public String getEmployee(){

    }
}
