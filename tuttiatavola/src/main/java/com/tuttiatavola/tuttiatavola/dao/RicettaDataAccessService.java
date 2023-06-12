package com.tuttiatavola.tuttiatavola.dao;


import com.tuttiatavola.tuttiatavola.model.Ricetta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RicettaDataAccessService implements RicettaDao {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public RicettaDataAccessService(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertRicetta(Ricetta ricetta) {
        final String sql = "INSERT INTO ricette( nome_ricetta) VALUES ('" + ricetta.getNomeRicetta() + "')";
        jdbcTemplate.update(sql);
        return 0;
    }

    @Override
    public List<Ricetta> selectAllRicette() {
        final String sql = "SELECT * FROM ricette";
        List<Ricetta> people = jdbcTemplate.query(sql, (resultSet, i) -> {
            int id = Integer.parseInt(resultSet.getString("id_ricetta"));
            String name = resultSet.getString("nome_ricetta");
            return new Ricetta( id, name, null);
        });
        return people;
    }

    @Override
    public Ricetta getRicettaById(int idRicetta) {
        return null;
    }
}
