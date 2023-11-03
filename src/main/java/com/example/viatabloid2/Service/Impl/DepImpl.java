package com.example.viatabloid2.Service.Impl;

import com.example.viatabloid2.Model.Department;
import com.example.viatabloid2.Repository.DepRepository;
import com.example.viatabloid2.Service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepImpl implements DepService {

    @Autowired
    DepRepository depRepository;


    @Override
    public Department findById(int id) {
        return depRepository.findById(id);
    }

    @Override
    public void saveDep(Department department) {
        depRepository.save(department);
    }
}
