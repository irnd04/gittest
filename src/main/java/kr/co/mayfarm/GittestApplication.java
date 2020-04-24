package kr.co.mayfarm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import kr.co.mayfarm.service.WelcomeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class GittestApplication implements CommandLineRunner {
	
	private final WelcomeService welcomeService;
	
	public static void main(String[] args) {
		SpringApplication.run(GittestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		welcomeService.welcome();
		log.info("...");
		log.debug("debug....");
		log.error("error....");
		log.info("master");
	}

}
