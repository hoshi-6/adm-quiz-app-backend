// src/main/java/com/example/quizappbackend/repository/WITwentyOneRepository.java
package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WITwentyTwoRepository extends JpaRepository<WITwentyTwo, Long> {
}