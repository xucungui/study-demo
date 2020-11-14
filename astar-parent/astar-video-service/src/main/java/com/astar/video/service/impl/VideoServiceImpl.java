package com.astar.video.service.impl;

import com.astar.common.entity.Video;
import com.astar.video.dao.VideoMapper;
import com.astar.video.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl implements IVideoService {

    @Autowired
    private VideoMapper videoMapper;
    @Override
    public Video findById(int videoId) {
        return videoMapper.findById(videoId);
    }
}
