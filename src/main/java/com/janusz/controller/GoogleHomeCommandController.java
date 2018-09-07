package com.janusz.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * @author Dmytro Melnychuk
 */
@RestController
public class GoogleHomeCommandController {

    @RequestMapping(value = "/parseCommand", method = POST, produces = "application/json")
    public ResponseEntity<String> index() {
        System.out.println("Shoot");
        HttpHeaders headers = new HttpHeaders();
        headers.add("Google-Assistant-API-Version", "v1");
        return new ResponseEntity<>(testResposne(), headers, HttpStatus.OK);
    }

    private String testResposne() {
        return "{\n" +
                "  \"conversation_token\": \"42\",\n" +
                "  \"expect_user_response\": false,\n" +
                "\n" +
                "  \"final_response\": {\n" +
                "    \"speech_response\": {\n" +
                "      \"text_to_speech\": \"Thanks for playing!\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }
}
