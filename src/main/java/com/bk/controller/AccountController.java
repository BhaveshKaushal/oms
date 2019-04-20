package com.bk.controller;

import com.bk.model.Account;
import com.bk.service.AccountService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/account")
@Log4j2
public class AccountController implements BaseController<Account> {

    private AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
     public void create(@Valid @RequestBody Account account) {
         service.create(account);
     }

     @RequestMapping(value = "/{id}", method = RequestMethod.GET)
     public Account getById(@PathVariable("id") String id) {
       return   service.getById(id);
     }
}
