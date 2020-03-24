package kr.co.mayfarm.service;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WelcomeService {
	public void welcome() {
		log.info("Hello, World!");
	}
}
