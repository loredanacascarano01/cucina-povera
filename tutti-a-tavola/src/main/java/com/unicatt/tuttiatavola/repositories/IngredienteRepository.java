package com.unicatt.tuttiatavola.repositories;

import com.unicatt.tuttiatavola.models.Ingrediente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
}
