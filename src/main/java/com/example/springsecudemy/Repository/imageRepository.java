package com.example.springsecudemy.Repository;

import com.example.springsecudemy.Model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface imageRepository extends JpaRepository<Image,Long> {
}
