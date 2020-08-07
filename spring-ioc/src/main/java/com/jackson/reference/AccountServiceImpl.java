package com.jackson.reference;

public class AccountServiceImpl implements AccountService {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        System.out.println("accountService 正在装配 UserService属性");
        this.userService = userService;
    }

    @Override
    public String toString() {
        return "AccountServiceImpl";
    }
}
