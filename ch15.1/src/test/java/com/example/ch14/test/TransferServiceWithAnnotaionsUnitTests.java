package com.example.ch14.test;

import com.example.ch14.model.Account;
import com.example.ch14.repository.AccountRepository;
import com.example.ch14.service.TransferService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class TransferServiceWithAnnotaionsUnitTests {
    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private TransferService transferService;

    @Test
    public void moneyTransferHappyFlow(){
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account destination = new Account();
        destination.setId(2);
        destination.setAmount(new BigDecimal(1000));

        BDDMockito.given(accountRepository.findById(sender.getId()))
                .willReturn(Optional.of(sender));

        BDDMockito.given(accountRepository.findById(destination.getId()))
                .willReturn(Optional.of(destination));

        transferService.transferMoney(
                sender.getId(),
                destination.getId(),
                new BigDecimal(100)
        );

        Mockito.verify(accountRepository)
                .changeAmount(1, new BigDecimal(900));
        Mockito.verify(accountRepository)
                .changeAmount(2, new BigDecimal(1100));
    }

}
