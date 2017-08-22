package com.sinitsynvl.dataexam.repository;

import com.sinitsynvl.dataexam.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long>{
}
