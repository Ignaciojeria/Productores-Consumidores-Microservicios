package com.demogift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demogift.domain.Dia;

@Repository
public interface DiaRepository extends JpaRepository<Dia, Integer> {

}
