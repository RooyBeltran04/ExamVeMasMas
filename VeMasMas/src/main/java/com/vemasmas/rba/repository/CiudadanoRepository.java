package com.vemasmas.rba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vemasmas.rba.entity.CiudadanoDAO;

/**
 * @author rba
 *
 */
@Repository
public interface CiudadanoRepository extends JpaRepository<CiudadanoDAO, Long >{

}
