package com.pnc.ibm.controllers;

import com.pnc.ibm.models.Transactions;
import com.pnc.ibm.models.TransactionsList;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("pnc/v1")
public class BankController {

    @GetMapping("/trans/{accountId}")
    public ResponseEntity<TransactionsList> getTransactions(@PathVariable("accountId") String accountId){
       List<Transactions> list =Arrays.asList(new Transactions(23L,"abcd",23L,
               "deposit",23.0),
               new Transactions(23L,"abcd",23L,
                       "deposit",23.0)
       );
        TransactionsList transactionsList = new TransactionsList();
         transactionsList.setTransactionList(list);

        return new ResponseEntity<>(transactionsList, HttpStatus.ACCEPTED) ;
    }
}
