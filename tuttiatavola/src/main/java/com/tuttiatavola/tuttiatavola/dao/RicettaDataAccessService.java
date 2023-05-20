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
    public int insertRicetta(Ricetta ricetta) {
        return 0;
    }

    @Override
    public List<Ricetta> selectAllRicette() {
        return null;
    }
}
