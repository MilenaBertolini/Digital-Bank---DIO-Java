import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String name = scan.nextLine();


        Client client = new Client();
        client.setName(name);

        Account ca = new CurrentAccount(client);
        ca.deposit(100);

        Account savings = new SavingsAccount(client);
        ca.transfer(100, savings);

        ca.bankStatement();
        savings.bankStatement();
    }
}
