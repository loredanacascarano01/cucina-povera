package com.tuttiatavola.tuttiatavola.api;

import com.tuttiatavola.tuttiatavola.model.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("api/v1/menu")
@RestController
public class MenuController {

    @GetMapping
    public List<Menu> retrieveAllMenu(){
     return new ArrayList<Menu>();
    }

}
