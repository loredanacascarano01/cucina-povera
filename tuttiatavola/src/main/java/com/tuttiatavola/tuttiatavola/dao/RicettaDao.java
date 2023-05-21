package com.tuttiatavola.tuttiatavola.dao;


import com.tuttiatavola.tuttiatavola.model.Ricetta;

import java.util.List;

public interface RicettaDao {

    int insertRicetta( Ricetta ricetta);


    List<Ricetta> selectAllRicette();

    Ricetta getRicettaById(int idRicetta);
}
