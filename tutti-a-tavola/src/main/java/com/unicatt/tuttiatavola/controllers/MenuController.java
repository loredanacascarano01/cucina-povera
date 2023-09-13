package com.unicatt.tuttiatavola.controllers;


import com.unicatt.tuttiatavola.models.Menu;
import com.unicatt.tuttiatavola.models.presentation.MenuRequest;
import com.unicatt.tuttiatavola.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {
    @Autowired
    MenuService menuService;

    @GetMapping()
    public ResponseEntity<List<Menu>> retrieveMenus(){
        return ResponseEntity.ok(menuService.recuperaMenu());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Menu> retrieveMenu(@PathVariable Long id){
        return ResponseEntity.ok(menuService.recuperaMenu(id));
    }

    @PostMapping()
    public ResponseEntity<Menu> addMenu(@RequestBody MenuRequest menu){
        return ResponseEntity.ok(menuService.aggiungiMenu(menu));
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
