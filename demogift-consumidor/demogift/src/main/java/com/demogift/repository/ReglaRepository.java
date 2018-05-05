package com.demogift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demogift.domain.ReglaDia;

@Repository
public interface ReglaRepository extends JpaRepository<ReglaDia,Long> {

}
