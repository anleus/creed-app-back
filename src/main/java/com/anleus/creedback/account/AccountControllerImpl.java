package com.anleus.creedback.account;

import org.openapitools.api.AccountApi;
import org.openapitools.model.AccountTs;
import org.openapitools.model.GroupTs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountControllerImpl implements AccountApi {

    @Autowired
    private AccountService accountService;

    @Override
    public ResponseEntity<AccountTs> createAccount(AccountTs accountTs) {
        return null;
    }

    @Override
    public ResponseEntity<AccountTs> deleteAccount(String id) {
        return null;
    }

    @Override
    public ResponseEntity<AccountTs> getAccountByUsername(String username) {
        return null;
    }

    @Override
    public ResponseEntity<List<GroupTs>> getAccountGroups(String id) {
        return null;
    }
}
