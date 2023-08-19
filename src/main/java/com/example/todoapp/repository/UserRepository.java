package com.example.todoapp.repository;

import com.example.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

//JPA, Java nesnelerini ilişkisel veritabanlarına bağlayan ve yöneten bir teknolojidir.

// save(entity): Bir nesneyi veritabanına eklemek veya güncellemek için kullanılır.
// findById(id): Belirli bir kimlik (ID) değerine sahip nesneyi veritabanından getirir.
// findAll(): Tüm nesneleri veritabanından getirir.
// delete(entity): Bir nesneyi veritabanından siler.
// count(): Toplam nesne sayısını döndürür.
public interface UserRepository extends JpaRepository<User,Long> {
}
