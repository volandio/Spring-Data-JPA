package com.sinitsynvl.dataexam.test.util;

import com.sinitsynvl.dataexam.entity.Bank;

public class BankUtil {

    public static Bank createBank() {
        Bank bank = new Bank();
        bank.setName("Gold Bank");

        return bank;
    }
}
