package com.educandoweb.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.curso.entities.User;

@RestController //criando um recurso
@RequestMapping(value = "/users") 
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAl(){ 
		User u = new User(1L,"Maria","maria@gmail.com","99999","1234567");
		return ResponseEntity.ok().body(u);
	}
}
