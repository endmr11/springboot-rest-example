package com.example.todoapp.repository;

import com.example.todoapp.entity.Todo;
import com.example.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//JPA, Java nesnelerini ilişkisel veritabanlarına bağlayan ve yöneten bir teknolojidir.
public interface TodoRepository extends JpaRepository<Todo,Long> {//
}
