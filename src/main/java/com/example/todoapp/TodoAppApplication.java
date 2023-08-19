package com.example.todoapp;

import com.example.todoapp.entity.Todo;
import com.example.todoapp.entity.User;
import com.example.todoapp.repository.TodoRepository;
import com.example.todoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {

	@Autowired ///Bu anotasyon, bir nesnenin otomatik olarak oluşturulmasını ve enjekte edilmesini sağlar.
	private UserRepository userRepository;
	@Autowired
	private TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}



	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setPassword("pass");
		user.setUsername("eren");
		Todo todo = new Todo();
		todo.setContent("aaaaaaaa");
		user.getTodoList().add(todo);
		userRepository.save(user);

	}




}
