package com.unicatt.tuttiatavola.services;

import com.unicatt.tuttiatavola.models.Ricetta;
import com.unicatt.tuttiatavola.repositories.RicettaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface RicettaService {
  List<Ricetta> recuperaTutteLeRicette();
}
