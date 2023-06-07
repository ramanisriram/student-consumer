package com.playtech.studentconsumer.controller;

import com.playtech.studentconsumer.bean.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentReceiver {


    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String aName() {
        return "Welcome.html";
    }


}
