package by.belhard.kids_pro;

public class Main {

    public static void main(String[] args) {

        Banking banking = new Banking();
        banking.addNewAccount("Vasily", "123");
        banking.addNewAccount("Peter", "456");

        banking.addCash("Vasily", 100);
        banking.addCash("Peter", 1000000);

        System.out.println("Введите название аккаунта");
        String accountName = Screen.getInput();
        System.out.println("Введите пароль");
        boolean check = banking.checkPassword(accountName, Screen.getInput());
        if (!check) {
            System.out.println("Неправильно введен пароль");
            return;
        }

        String input;

        do {
            System.out.println(banking.getAccountCash(accountName));
            Screen.print(Screen.getMainMenu());
            input = Screen.getInput();

            switch (input) {
                case "1":
                    System.out.println("Введите сумму");
                    input = Screen.getInput();
                    banking.addCash(accountName, Integer.parseInt(input));
                    break;
                case "2":
                    System.out.println("Введите сумму");
                    input = Screen.getInput();
                    banking.getCash(accountName, Integer.parseInt(input));
                    break;
                case "3":
                    System.out.println("Введите аккаунт, на который вы хотите перевести деньги");
                    String toName = Screen.getInput();
                    System.out.println("Введите сумму");
                    input = Screen.getInput();
                    banking.transfer(accountName, toName, Integer.parseInt(input));
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Такого пункта не существует");
                    break;
            }

        } while (!input.equals("0"));
        System.out.println("Bye-bye");
    }
}
