package C322Group7.FinalProject.controller;

import C322Group7.FinalProject.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class BoardController {

    //@Autowired
    //private BoardTemplate boardTemplate;

    @MessageMapping("/post") // /app/post
    @SendTo("/board/public")
    private Post receivePublicPost(@Payload Post post ){
        return post;
    }


}
