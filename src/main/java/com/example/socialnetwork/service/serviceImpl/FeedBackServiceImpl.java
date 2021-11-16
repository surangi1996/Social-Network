package com.example.socialnetwork.service.serviceImpl;

import com.example.socialnetwork.model.FeedBack;
import com.example.socialnetwork.repository.FeedBackRepository;
import com.example.socialnetwork.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedBackServiceImpl implements FeedBackService {

    @Autowired
    private FeedBackRepository feedBackRepository;

    @Override
    public List<FeedBack> getFeedBack() {
        return feedBackRepository.findAll();
    }

    @Override
    public boolean saveFeedBack(FeedBack feedBack) {
        this.feedBackRepository.save(feedBack);
        return true;
    }

    @Override
    public FeedBack getFeedBackById(int id) {
        Optional<FeedBack> optional = feedBackRepository.findById(id);
        FeedBack feedBack = null;
        if (optional.isPresent()) {
            feedBack = optional.get();
        } else {
            throw new RuntimeException("Customer Not Found For Id :: " + id);
        }
        return feedBack;
    }

    @Override
    public boolean deleteFeedBackById(int id) {
        this.feedBackRepository.deleteById(id);
        return true;
    }
}
