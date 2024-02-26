package net.yassine.demokeycloak;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.yassine.demokeycloak.Repo.UserAppRepo;
import net.yassine.demokeycloak.entities.Userapp;

@SpringBootApplication
public class DemokeycloakApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemokeycloakApplication.class, args);
	}


@Bean
public CommandLineRunner runner(UserAppRepo userAppRepo){

return Arg->{


userAppRepo.save(new Userapp(null,"yacine","aoufi","@gmail.com"));
userAppRepo.save(new Userapp(null,"samir","aoufi","@gmail.com"));
userAppRepo.save(new Userapp(null,"houcine","aoufi","@gmail.com"));

};




}





}
