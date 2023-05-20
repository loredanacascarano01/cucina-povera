package com.tuttiatavola.tuttiatavola.dao;


import com.tuttiatavola.tuttiatavola.model.Ricetta;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RicettaDao {

    int insertRicetta( Ricetta ricetta);


    List<Ricetta> selectAllRicette();

}
