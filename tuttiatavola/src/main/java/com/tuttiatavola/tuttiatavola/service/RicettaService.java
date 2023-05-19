package com.tuttiatavola.tuttiatavola.service;

import com.tuttiatavola.tuttiatavola.dao.RicettaDao;
import com.tuttiatavola.tuttiatavola.model.Ricetta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class RicettaService {
    private final com.tuttiatavola.tuttiatavola.dao.RicettaDao ricettaDao;

    @Autowired
    public RicettaService(@Qualifier("fakeDao") RicettaDao ricettaDao) {
        this.ricettaDao = ricettaDao;
    }

    public int addRicetta(Ricetta ricetta){
        return ricettaDao.insertRicetta(ricetta);
    }

    public List<Ricetta> getAllRicette(){
        return ricettaDao.selectAllRicette();
    }

    public Optional<Ricetta> getRicettaById(UUID id){
        return ricettaDao.selectRicettaById(id);
    }

    public int deleteRicetta(UUID id){
        return ricettaDao.deleteRicettaById(id);
    }

    public int updateRicette(UUID id, Ricetta ricetta){
        return ricettaDao.updateRicettaBy(id, ricetta);
    }
}
