package com.galiero.popolazione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galiero.popolazione.model.Regione;

@Repository
public interface RegioneDB extends JpaRepository <Regione, Integer>{

	@Query(value= "select sum(totale) from popolazione_italiana_regione where regione=:regione;", nativeQuery = true)
	int getTotaleRegione(@Param(value="region")String regione);
	
	
	@Query(value= "select sum(totale) from popolazione_italiana_regione where regione=:regione;", nativeQuery = true)
	int getTotaleItalia();
	
	
	@Query(value= "select * from popolazione_italiana_regione where regione=:regione and comune=:comune;", nativeQuery = true)
	Regione getByRegioneAndComune(@Param(value="regione")String regione, @Param(value="comune")String comune);

	@Query(value= "select distinct regione from popolazione_italiana_regione;", nativeQuery = true)
	List<String> getRegioni();
}
