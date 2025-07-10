package com.informatorio.info_market.repository.categoria;

import com.informatorio.info_market.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
