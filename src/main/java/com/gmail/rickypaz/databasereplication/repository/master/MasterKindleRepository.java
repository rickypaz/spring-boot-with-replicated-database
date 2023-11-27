package com.gmail.rickypaz.databasereplication.repository.master;

import com.gmail.rickypaz.databasereplication.domain.Kindle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterKindleRepository extends JpaRepository<Kindle, Integer> {
}
