package com.unicatt.tuttiatavola.repositories;

import com.unicatt.tuttiatavola.models.Contiene;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortataRepository extends JpaRepository<Contiene, Long> {
}
