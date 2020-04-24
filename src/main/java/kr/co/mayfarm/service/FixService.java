package kr.co.mayfarm.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FixService {
    public void fix() {
        log.info("fix......");
        log.info("fix....");
        log.info("fix...");
        log.info("master fix...");
    }
}
