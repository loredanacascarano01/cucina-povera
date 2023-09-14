package com.unicatt.tuttiatavola.repositories;

import com.unicatt.tuttiatavola.models.Contiene;
import com.unicatt.tuttiatavola.models.Portata;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PortataRepository extends JpaRepository<Portata, Long> {
    List<Portata> findAllByIdPasto(Long id);
}
