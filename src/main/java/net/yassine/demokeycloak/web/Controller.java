package net.yassine.demokeycloak.web;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.yassine.demokeycloak.Repo.UserAppRepo;
import net.yassine.demokeycloak.entities.Userapp;

@RestController
@RequestMapping("users")
public class Controller {
    

private UserAppRepo userAppRepo;

public Controller(UserAppRepo userAppRepo){
    this.userAppRepo=userAppRepo;
}

 
@GetMapping("/all")
public List<Userapp> GetUsers(){
return userAppRepo.findAll();

}

 
@GetMapping("/{id}")
public Userapp getone(@PathVariable Long id){
return userAppRepo.findById(id).orElse(null);

}

@GetMapping("profile")
public Authentication get(Authentication auth){
    return auth;
}




}
