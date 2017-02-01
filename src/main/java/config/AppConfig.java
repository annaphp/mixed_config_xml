package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Team;
import beans.TeamImplementation;

@Configuration
public class AppConfig {
	
	@Bean
	public Team redSox(){
		return new TeamImplementation("RedSox");
	}
	
}
