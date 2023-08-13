package hotel.reservations.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hotel.reservations.hotel.json.Greeting;

@Configuration
public class AppConfig {

    @Bean
    Greeting defaultGreeting() {
		return new Greeting("Hello, Victoria!");
	}

    @Bean
    Greeting bonjourGreeting() {
		return new Greeting("Bonjour, Victoria!");
	}

}
