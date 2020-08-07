package com.jackson.reference;

public class UserServiceImpl implements UserService {

    private AccountService accountService;

    public void setAccountService(AccountService accountService) {
        System.out.println("UserService 正在装配 accountService属性");
        this.accountService = accountService;
    }

    public AccountService getAccountService() {
        return accountService;
    }

    @Override
    public String toString() {
        return "UserServiceImpl";
    }
}
