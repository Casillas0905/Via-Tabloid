package com.example.viatabloid2.Repository;

import com.example.viatabloid2.Model.Department;
import com.example.viatabloid2.Model.Storie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepRepository extends JpaRepository<Department, Long> {
    Department findById(int id);
    Department findByName(String name);
}
