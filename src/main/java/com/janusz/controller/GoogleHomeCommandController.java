package com.janusz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Dmytro Melnychuk
 */
@RestController
public class GoogleHomeCommandController {

    @RequestMapping(value = "/parseCommand", method = POST)
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
