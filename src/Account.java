public abstract class Account implements InterfaceAccount{

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;


    protected Account(Client client) {
        this.client = client;
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENTIAL++;
    }

    @Override
    public void removeMoney(double value) {
        this.balance = balance - value;
        //balance -= value;
    }

    @Override
    public void deposit(double value) {
        this.balance = balance + value;
        //balance += value;
    }

    @Override
    public void transfer(double value, Account DestinationAccount) {
        this.removeMoney(value);
        DestinationAccount.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void bankCommonInformation(){
        System.out.println(String.format("Client: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }


}
