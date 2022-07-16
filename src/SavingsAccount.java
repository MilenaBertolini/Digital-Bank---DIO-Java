public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void bankStatement() {
        System.out.println("** Savings account statement **");
        super.bankCommonInformation();
    }
}
