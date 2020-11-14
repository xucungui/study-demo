package com.astar.order.controller;


import com.astar.common.entity.Video;
import com.astar.common.entity.VideoOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/order/")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/save")
    public Object save(int videoId) {
        Video video = restTemplate.getForObject("http://localhost:9002/api/v1/video/find_by_id?videoId=" + videoId, Video.class);
        VideoOrder order = new VideoOrder();
        order.setVideoId(video.getId());
        order.setCreateTime(new Date());
        order.setVideoTitle(video.getTitle());
        order.setVideoImg(video.getCoverImg());
        return order;
    }
}
