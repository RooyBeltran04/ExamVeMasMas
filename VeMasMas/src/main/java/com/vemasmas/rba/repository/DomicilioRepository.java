package com.vemasmas.rba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vemasmas.rba.entity.DomicilioDAO;

/**
 * @author rba
 *
 */
@Repository
public interface DomicilioRepository extends JpaRepository<DomicilioDAO, Long >{

}
