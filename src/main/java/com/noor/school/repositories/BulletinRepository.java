package com.noor.school.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.noor.school.entities.Bulletin;

public interface BulletinRepository extends JpaRepository<Bulletin, Long> {
	@Query("select bulletin from Bulletin bulletin where bulletin.libelle_bulletin like :x")
	public Page<Bulletin> chercher(@Param("x")String mc,Pageable pageable);
}
