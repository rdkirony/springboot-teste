package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.User;

//instanciando um objeto repository
public interface UserRepository extends JpaRepository<User, Long> {

}
