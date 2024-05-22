import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out,println("Enter bank type (TPBANK or VIETCOMBANK");
        String bankTypeInput = sc.nextLine().toUpperCase();
        BankType bankType = BankType.valueOf(bankTypeInput);
        Bank bank = BankFactory.getBank(bankType);
        System.out.println("Bank name: "+ bank.getBankName());

    }
}
