package by.belhard.kids_pro.les1;

import java.util.HashMap;

public class Banking {

    private HashMap<String, Account> accounts = new HashMap<>();

    public boolean checkPassword(String account, String password) {

        boolean result = false;

        if (accounts.get(account).checkPassword(password)) result = true;

        return result;
    }

    public void addCash(String accountName, int cash) {

        Account account = accounts.get(accountName);

        account.addCash(cash);
    }

    public void getCash(String accountName, int cash) {

        Account account = accounts.get(accountName);

        account.getCash(cash);
    }

    public void transfer(String fromName, String toName, int cash) {

        Account accountFrom = accounts.get(fromName);
        Account accountTo = accounts.get(toName);

        accountFrom.getCash(cash);
        accountTo.addCash(cash);
    }

    public void addNewAccount(String name, String password) {

        Account account = new Account(name, password);

        accounts.put(name, account);
    }

    public int getAccountCash(String accountName) {
        return accounts.get(accountName).cash();
    }
}
