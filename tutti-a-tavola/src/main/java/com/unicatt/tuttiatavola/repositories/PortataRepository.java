package com.unicatt.tuttiatavola.repositories;

import com.unicatt.tuttiatavola.models.Contiene;
import com.unicatt.tuttiatavola.models.Portata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortataRepository extends JpaRepository<Portata, Long> {
}
