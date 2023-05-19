package com.tuttiatavola.tuttiatavola.dao;


import com.tuttiatavola.tuttiatavola.model.Ricetta;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RicettaDao {

    int insertRicetta(UUID id, Ricetta ricetta);

    default int insertRicetta(Ricetta ricetta){
        UUID id = UUID.randomUUID();
        return insertRicetta(id, ricetta);
    }

    List<Ricetta> selectAllRicette();

    Optional<Ricetta> selectRicettaById (UUID id);

    int deleteRicettaById(UUID id);

    int updateRicettaBy(UUID id, Ricetta ricetta);

}
