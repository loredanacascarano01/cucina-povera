package com.tuttiatavola.tuttiatavola.dao;

import com.tuttiatavola.tuttiatavola.model.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MenuDataAccessService implements  MenuDao{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public MenuDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<Menu> retrieveAllMenu() {
        String querySql = "select * from Menu";
        return jdbcTemplate.queryForList(querySql, Menu.class);
    }

    @Override
    public Menu retrieveMenuById(int idMenu) {
        return null;
    }

    @Override
    public void createNewMenu(Menu menu) {

    }

    @Override
    public void updateMenu(int idMenu, Menu menu) {

    }

    @Override
    public void deleteMenu(int idMenu) {

    }
}
