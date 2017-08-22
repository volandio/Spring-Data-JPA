package com.sinitsynvl.dataexam.repository;

import com.sinitsynvl.dataexam.entity.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
