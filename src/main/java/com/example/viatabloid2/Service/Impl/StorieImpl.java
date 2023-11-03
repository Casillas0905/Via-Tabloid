package com.example.viatabloid2.Service.Impl;

import com.example.viatabloid2.Model.Department;
import com.example.viatabloid2.Model.Storie;
import com.example.viatabloid2.Repository.DepRepository;
import com.example.viatabloid2.Repository.StorieRepository;
import com.example.viatabloid2.Service.StorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StorieImpl implements StorieService {

    @Autowired
    StorieRepository storieRepository;
    @Autowired
    DepRepository depRepository;
    @Override
    public Storie findById(int id) {
        return storieRepository.findById(id);
    }

    @Override
    public List<Storie> findAll() {
        return storieRepository.findAll();
    }

    @Override
    public void saveStorie(Storie storie) throws Exception {
        Department department= depRepository.findById(storie.getDepartmentId());
        if(department == null){
            throw new Exception("No department found");
        }
        storieRepository.save(storie);
    }
}
