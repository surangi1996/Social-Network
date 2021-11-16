package com.example.socialnetwork.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("FeedBack")
@NoArgsConstructor
@AllArgsConstructor
public class FeedBack {
    private int id;
    private String userName;
    private String description;
    private String imageUrl;
    private String videoUrl;
}
