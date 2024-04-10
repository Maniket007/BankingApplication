package net.boomJava.banking.mapper;

import net.boomJava.banking.dto.AccountDto;
import net.boomJava.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto)
    {
        Account account  = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }
    public static AccountDto mapToAccountDto(Account account)
    {
        AccountDto accountDto = new AccountDto(
                account.getID(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }
}
