package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	//metodo para acessar usuarios. retorna um ReponseEntity do tipo <User>
	//ResponseEntity -> usado para retornar respostas de requisições web
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@email.com", "99999", "12345");
		// .ok() retorna a resposa com sucesso e .body() corpo da resposta do objeto u
		return ResponseEntity.ok().body(u);
	}
	
}
