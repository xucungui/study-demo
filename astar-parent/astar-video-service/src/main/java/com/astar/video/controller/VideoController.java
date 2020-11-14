package com.astar.video.controller;

import com.astar.video.service.IVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/video")
public class VideoController {

    @Autowired
    private IVideoService videoService;

    @RequestMapping("find_by_id")
    public Object findById(int videoId) {
        return videoService.findById(videoId);
    }
}
