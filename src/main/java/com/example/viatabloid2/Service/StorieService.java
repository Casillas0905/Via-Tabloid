package com.example.viatabloid2.Service;

import com.example.viatabloid2.Model.Storie;

import java.util.List;

public interface StorieService {
    Storie findById(int id);
    List<Storie> findAll();
    void saveStorie(Storie storie) throws Exception;
}
