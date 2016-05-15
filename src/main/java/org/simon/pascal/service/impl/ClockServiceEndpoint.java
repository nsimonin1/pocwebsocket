package org.simon.pascal.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.simon.pascal.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

/**
 * Created by SimonPascal on 05/15/2016.
 */
//@ServerEndpoint("/clock")
@Service
@Slf4j
public class ClockServiceEndpoint {
    @Autowired
    private SimpMessagingTemplate template;

    @Scheduled(cron="*/1 * * * * ?")
    public void trigger() {

        final String time=DateUtil.getTime();
        this.template.convertAndSend("/topic/clock", "" + time);
    }
}
