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
        System.out.println("Shoot");
        return testResposne();
    }

    private String testResposne() {
        return "{\n" +
                "  \"fulfillmentText\": \"This is a text response\",\n" +
                "  \"fulfillmentMessages\": [\n" +
                "    {\n" +
                "      \"card\": {\n" +
                "        \"title\": \"card title\",\n" +
                "        \"subtitle\": \"card text\",\n" +
                "        \"imageUri\": \"https://assistant.google.com/static/images/molecule/Molecule-Formation-stop.png\",\n" +
                "        \"buttons\": [\n" +
                "          {\n" +
                "            \"text\": \"button text\",\n" +
                "            \"postback\": \"https://assistant.google.com/\"\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"source\": \"example.com\",\n" +
                "  \"payload\": {\n" +
                "    \"google\": {\n" +
                "      \"expectUserResponse\": true,\n" +
                "      \"richResponse\": {\n" +
                "        \"items\": [\n" +
                "          {\n" +
                "            \"simpleResponse\": {\n" +
                "              \"textToSpeech\": \"this is a simple response\"\n" +
                "            }\n" +
                "          }\n" +
                "        ]\n" +
                "      }\n" +
                "    },\n" +
                "    \"facebook\": {\n" +
                "      \"text\": \"Hello, Facebook!\"\n" +
                "    },\n" +
                "    \"slack\": {\n" +
                "      \"text\": \"This is a text response for Slack.\"\n" +
                "    }\n" +
                "  },\n" +
                "  \"outputContexts\": [\n" +
                "    {\n" +
                "      \"name\": \"projects/${PROJECT_ID}/agent/sessions/${SESSION_ID}/contexts/context name\",\n" +
                "      \"lifespanCount\": 5,\n" +
                "      \"parameters\": {\n" +
                "        \"param\": \"param value\"\n" +
                "      }\n" +
                "    }\n" +
                "  ],\n" +
                "  \"followupEventInput\": {\n" +
                "    \"name\": \"event name\",\n" +
                "    \"languageCode\": \"en-US\",\n" +
                "    \"parameters\": {\n" +
                "      \"param\": \"param value\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
    }


}
