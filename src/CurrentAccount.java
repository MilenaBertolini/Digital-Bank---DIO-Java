public class CurrentAccount extends Account {

    public CurrentAccount(Client client) {
        super(client);
    }

    @Override
    public void bankStatement() {
        System.out.println("** Current account statement **");
        super.bankCommonInformation();
    }
}
