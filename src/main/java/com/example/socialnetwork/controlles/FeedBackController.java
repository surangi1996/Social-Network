package com.example.socialnetwork.controlles;

import com.example.socialnetwork.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/feedback")
public class FeedBackController {

    @Autowired
    private FeedBackService feedBackService;


}
