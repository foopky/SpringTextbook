package com.example.ch14.test;

import com.example.ch14.AccountNotFoundException;
import com.example.ch14.model.Account;
import com.example.ch14.repository.AccountRepository;
import com.example.ch14.service.TransferService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.never;

@ExtendWith(MockitoExtension.class)
public class TransferServiceExceptionWithAnnotationsUnitTests {
    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private TransferService transferService;

    @Test
    public void moneyTransferHappyFlow() {
        Account sender = new Account();
        sender.setId(1);
        sender.setAmount(new BigDecimal(1000));

        Account destination = new Account();
        destination.setId(2);
        destination.setAmount(new BigDecimal(1000));

        BDDMockito.given(accountRepository.findById(1L))
                .willReturn(Optional.of(sender));

        BDDMockito.given(accountRepository.findById(2L))
                .willReturn(Optional.empty());

        assertThrows(AccountNotFoundException.class,
                () -> transferService.transferMoney(1, 2, new BigDecimal(100)));

        Mockito.verify(accountRepository, never())
                .changeAmount(anyLong(), any());
    }
}
