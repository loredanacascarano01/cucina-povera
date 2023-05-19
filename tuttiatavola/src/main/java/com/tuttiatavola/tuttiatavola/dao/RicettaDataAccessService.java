package com.tuttiatavola.tuttiatavola.dao;


import com.tuttiatavola.tuttiatavola.model.Ricetta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class RicettaDataAccessService implements RicettaDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public RicettaDataAccessService(org.springframework.jdbc.core.JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertRicetta(UUID id, Ricetta ricetta) {
        final String sql = "INSERT INTO Ricetta( id, name) VALUES ('" + id+ "', '" + ricetta.getName() + "')";
        jdbcTemplate.update(sql);
        return 0;
    }

    @Override
    public List<Ricetta> selectAllRicette() {
        final String sql = "SELECT id, name FROM Ricetta";
        List<Ricetta> ricette = jdbcTemplate.query(sql, (resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");
            return new Ricetta(id, name);
        });
        return ricette;
    }

    @Override
    public Optional<Ricetta> selectRicettaById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteRicettaById(UUID id) {
        return 0;
    }

    @Override
    public int updateRicettaBy(UUID id, Ricetta ricetta) {
        return 0;
    }
}
