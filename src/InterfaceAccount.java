public interface InterfaceAccount {

    void removeMoney(double value);

    void deposit(double value);

    void transfer(double value, Account DestinationAccount);

    void bankStatement();

}
