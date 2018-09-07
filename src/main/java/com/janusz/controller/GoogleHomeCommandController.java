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
        System.out.println(getJanushLogo());
        HttpHeaders headers = new HttpHeaders();
        headers.add("Google-Assistant-API-Version", "v1");
        return new ResponseEntity<>(testResposne(), headers, HttpStatus.OK);
    }

    private String getJanushLogo(){
        return "\\__    _/(  ___  )( (    /||\\     /|(  ____ \\/ ___   )                           \n" +
                "   )  (  | (   ) ||  \\  ( || )   ( || (    \\/\\/   )  |                           \n" +
                "   |  |  | (___) ||   \\ | || |   | || (_____     /   )                           \n" +
                "   |  |  |  ___  || (\\ \\) || |   | |(_____  )   /   /                            \n" +
                "   |  |  | (   ) || | \\   || |   | |      ) |  /   /                             \n" +
                "|\\_)  )  | )   ( || )  \\  || (___) |/\\____) | /   (_/\\                           \n" +
                "(____/   |/     \\||/    )_)(_______)\\_______)(_______/                           \n" +
                "                                                                                 \n" +
                " ______   _______ _________ _                                                    \n" +
                "(  __  \\ (  ___  )\\__   __/( \\   |\\     /|                                       \n" +
                "| (  \\  )| (   ) |   ) (   | (   ( \\   / )                                       \n" +
                "| |   ) || (___) |   | |   | |    \\ (_) /                                        \n" +
                "| |   | ||  ___  |   | |   | |     \\   /                                         \n" +
                "| |   ) || (   ) |   | |   | |      ) (                                          \n" +
                "| (__/  )| )   ( |___) (___| (____/\\| |                                          \n" +
                "(______/ |/     \\|\\_______/(_______/\\_/                                          \n" +
                "                                                                                 \n" +
                " _______  _______  _______ _________ _______ _________ _______  _       _________\n" +
                "(  ___  )(  ____ \\(  ____ \\\\__   __/(  ____ \\\\__   __/(  ___  )( (    /|\\__   __/\n" +
                "| (   ) || (    \\/| (    \\/   ) (   | (    \\/   ) (   | (   ) ||  \\  ( |   ) (   \n" +
                "| (___) || (_____ | (_____    | |   | (_____    | |   | (___) ||   \\ | |   | |   \n" +
                "|  ___  |(_____  )(_____  )   | |   (_____  )   | |   |  ___  || (\\ \\) |   | |   \n" +
                "| (   ) |      ) |      ) |   | |         ) |   | |   | (   ) || | \\   |   | |   \n" +
                "| )   ( |/\\____) |/\\____) |___) (___/\\____) |   | |   | )   ( || )  \\  |   | |   \n" +
                "|/     \\|\\_______)\\_______)\\_______/\\_______)   )_(   |/     \\||/    )_)   )_(   \n" +
                "                                                                                ";
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
