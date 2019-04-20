package com.bk.repository;

import com.bk.model.Account;

public interface AccountRepository extends BaseRepository<Account, String> {

    Account findByUsername(String username);
}
