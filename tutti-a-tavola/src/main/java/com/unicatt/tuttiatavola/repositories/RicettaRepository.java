package com.unicatt.tuttiatavola.repositories;

import com.unicatt.tuttiatavola.models.Ricetta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RicettaRepository extends JpaRepository<Ricetta, Long> {
}
