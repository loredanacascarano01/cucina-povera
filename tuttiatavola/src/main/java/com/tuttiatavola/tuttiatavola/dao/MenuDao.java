package com.tuttiatavola.tuttiatavola.dao;

import com.tuttiatavola.tuttiatavola.model.Menu;

import java.util.List;

public interface MenuDao {
    List<Menu> retrieveAllMenu();
    Menu retrieveMenuById(int idMenu);
    void createNewMenu(Menu menu);
    void updateMenu(int idMenu, Menu menu);
    void deleteMenu(int idMenu);

}
