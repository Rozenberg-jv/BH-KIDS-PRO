package by.belhard.kids_pro;

public class Account {

    private String login;
    private String password;

    private int cash;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public void getCash(int cash) {
        this.cash -= cash;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public int cash() {
        return cash;
    }
}
