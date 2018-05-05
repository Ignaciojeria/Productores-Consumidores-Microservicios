package com.demogift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.demogift.domain.Campagna;

@Service
public interface CampagnaRepository extends JpaRepository<Campagna,Long> {

}
