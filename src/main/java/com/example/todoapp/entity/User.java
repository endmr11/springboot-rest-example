package com.example.todoapp.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity //Java sınıflarını veritabanı tablolarına eşleştirmek için kullanılır
@Table(name = "app_user") // Tablo adını belirtiyoruz. Çakışmaması için
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//Birincil anahtarımız için Hibernate'nin birbirinden farklı değer üreten üretecin özelliklerinin tanımlanmasını sağlayan bir anaotasyonudur
    private Long id;
    private String username;
    private String password;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Todo> todoList = new ArrayList<>();

    public User() {
    }

    public User(Long id, String username, String password, List<Todo> todoList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.todoList = todoList;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}
