package com.unicatt.tuttiatavola.services;

import com.unicatt.tuttiatavola.models.Menu;
import com.unicatt.tuttiatavola.models.presentation.MenuRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MenuService {
     List<Menu> recuperaMenu();

     Menu recuperaMenu(Long id);

     Menu aggiungiMenu(MenuRequest menuRequest);

}
