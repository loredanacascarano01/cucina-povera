package com.unicatt.tuttiatavola.repositories;

import com.unicatt.tuttiatavola.models.Contiene;
import com.unicatt.tuttiatavola.models.Menu;
import com.unicatt.tuttiatavola.models.Pasto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PastoRepository extends JpaRepository<Pasto, Long> {

}
