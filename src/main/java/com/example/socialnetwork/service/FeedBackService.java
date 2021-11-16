package com.example.socialnetwork.service;

import com.example.socialnetwork.model.FeedBack;

import java.util.List;

public interface FeedBackService {

    List<FeedBack> getFeedBack();
    boolean saveFeedBack(FeedBack feedBack);
    FeedBack getFeedBackById(int id);
    boolean deleteFeedBackById(int id);
}
