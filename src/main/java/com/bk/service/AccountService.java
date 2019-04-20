package com.bk.service;

import com.bk.model.Account;

public interface AccountService extends BaseService<Account> {

    Account create(Account account);

    Account getById(String id);
}
