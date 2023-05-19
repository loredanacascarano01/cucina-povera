package com.tuttiatavola.tuttiatavola.dao;

import com.tuttiatavola.tuttiatavola.model.Ricetta;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeRicettaDataAccessService implements RicettaDao {

    private static List<Ricetta> DB = new ArrayList<>();

    @Override
    public int insertRicetta(UUID id, Ricetta ricetta) {
        DB.add(new Ricetta(id, ricetta.getName()));
        return 1;
    }

    @Override
    public List<Ricetta> selectAllRicette() {
        return DB;
    }

    @Override
    public Optional<Ricetta> selectRicettaById(UUID id) {
        return DB.stream().filter(ricetta -> ricetta.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteRicettaById(UUID id) {
        Optional<Ricetta> ricetta = selectRicettaById(id);
        if(ricetta.isEmpty()){
            return 0;
        }
        DB.remove(ricetta.get());
        return 1;
    }

    @Override
    public int updateRicettaBy(UUID id, Ricetta ricetta) {
        return selectRicettaById(id).map(ricetta1 -> {
            int indexOfRicettaToUpdate = DB.indexOf(ricetta1);
            if(indexOfRicettaToUpdate >= 0){
                DB.set(indexOfRicettaToUpdate, new Ricetta (id, ricetta.getName()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }
}
