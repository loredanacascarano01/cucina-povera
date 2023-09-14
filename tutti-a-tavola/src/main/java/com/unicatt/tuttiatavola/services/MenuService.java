package com.unicatt.tuttiatavola.services;

import com.unicatt.tuttiatavola.models.presentation.MenuRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MenuService {
     List<MenuRequest> recuperaMenu();

     MenuRequest recuperaMenu(Long id);

     MenuRequest aggiungiMenu(MenuRequest menuRequest);

}
