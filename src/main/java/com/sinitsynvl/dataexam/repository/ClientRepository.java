package com.sinitsynvl.dataexam.repository;

import com.sinitsynvl.dataexam.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
