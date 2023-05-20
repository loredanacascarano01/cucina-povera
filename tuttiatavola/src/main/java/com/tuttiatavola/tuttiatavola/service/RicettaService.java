package com.tuttiatavola.tuttiatavola.service;

import com.tuttiatavola.tuttiatavola.dao.RicettaDao;
import com.tuttiatavola.tuttiatavola.model.Ricetta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RicettaService {
    private final com.tuttiatavola.tuttiatavola.dao.RicettaDao ricettaDao;

    @Autowired
    public RicettaService(@Qualifier("postgres") RicettaDao ricettaDao) {
        this.ricettaDao = ricettaDao;
    }

    public int addRicetta(Ricetta ricetta){
        return ricettaDao.insertRicetta(ricetta);
    }

    public List<Ricetta> getAllRicette(){
        return ricettaDao.selectAllRicette();
    }
}
