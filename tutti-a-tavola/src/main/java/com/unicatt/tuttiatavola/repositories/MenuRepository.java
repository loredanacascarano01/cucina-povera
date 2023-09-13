package com.unicatt.tuttiatavola.repositories;

import com.unicatt.tuttiatavola.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
