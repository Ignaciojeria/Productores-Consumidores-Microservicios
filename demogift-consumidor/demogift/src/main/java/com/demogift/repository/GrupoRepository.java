package com.demogift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demogift.domain.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {
}
