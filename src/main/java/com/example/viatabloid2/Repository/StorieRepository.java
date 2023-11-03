package com.example.viatabloid2.Repository;

import com.example.viatabloid2.Model.Storie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StorieRepository extends JpaRepository<Storie, Long> {
    Storie findById(int id);
    List<Storie> findAll();
}
