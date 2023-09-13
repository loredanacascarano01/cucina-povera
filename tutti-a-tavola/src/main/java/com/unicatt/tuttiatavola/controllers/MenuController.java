package com.unicatt.tuttiatavola.controllers;


import com.unicatt.tuttiatavola.models.Menu;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @GetMapping()
    public ResponseEntity<List<Menu>> retrieveMenus(){
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Menu> retrieveMenu(@PathVariable Long id){
        return null;
    }

    @PostMapping()
    public ResponseEntity<Menu> addMenu(@RequestBody Menu menu){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable Long id, @RequestBody Menu menu){
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable Long id){
        return null;
    }






}
