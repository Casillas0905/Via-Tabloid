package com.example.viatabloid2.Controller;

import com.example.viatabloid2.Model.Storie;
import com.example.viatabloid2.Service.StorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stories")
public class StorieController {
    private final StorieService storieService;

    public StorieController(StorieService storieService) {
        this.storieService = storieService;
    }

    @GetMapping("/{id}")
    public Storie getStorieById(@PathVariable int id) {
        return storieService.findById(id);
    }

    @GetMapping
    public List<Storie> getAllStories() {
        return storieService.findAll();
    }

    @PostMapping
    public void saveStorie(@RequestBody Storie storie) throws Exception {
        storieService.saveStorie(storie);
    }
}