package com.galiero.popolazione.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.galiero.popolazione.model.EtaEntity;

@Repository
public interface EtaDB extends JpaRepository <EtaEntity, Integer>{


	@Query(value= "select eta_numerica, maschi, femmine, concat((maschi/totale*100),'%') as maschi_perc ,"
			+ " concat((femmine/totale*100), '%') as femmine_perc,"
			+ " totale from popolazione_italiana_eta "
			+ " where eta_numerica between 18 and 26;", nativeQuery = true)
	EtaEntity getEtaIntervall(@Param(value="eta1")int eta1, @Param(value="eta2") int eta2);
	
	@Query(value= "select eta_numerica, maschi, femmine, concat((maschi/totale*100),'%') as maschi_perc ,"
			+ " concat((femmine/totale*100), '%') as femmine_perc,"
			+ " totale from popolazione_italiana_eta "
			+ " where eta_numerica between 18 and 26;", nativeQuery = true)
	EtaEntity getSumMaschi(@Param(value="eta1")int eta1, @Param(value="eta2") int eta2);
	
	@Query(value= "select eta_numerica, maschi, femmine, concat((maschi/totale*100),'%') as maschi_perc ,"
			+ " concat((femmine/totale*100), '%') as femmine_perc,"
			+ " totale from popolazione_italiana_eta "
			+ " where eta_numerica between 18 and 26;", nativeQuery = true)
	EtaEntity getSumFemmine(@Param(value="eta1")int eta1, @Param(value="eta2") int eta2);
	
	
	@Query(value= "select eta_numerica, maschi, femmine, concat((maschi/totale*100),'%') as maschi_perc ,"
			+ " concat((femmine/totale*100), '%') as femmine_perc,"
			+ " totale from popolazione_italiana_eta "
			+ " where eta_numerica between 18 and 26;", nativeQuery = true)
	EtaEntity getSumTotale(@Param(value="eta1")int eta1, @Param(value="eta2") int eta2);
}
