

public class BankAccount
{

    final private String    accountNumber;
    final private String    memberLastName;
    private double        balanceCdn;

    /**
     * Initialises the bank account details when called.
     * @param balanceCdn: The balance in the account.
     * @param accountNumber: The account number for the bank account.
     * @param memberLastName: Last name of the user's bank account.
     */
    BankAccount (final double balanceCdn,
                 final String accountNumber,
                 final String memberLastName)
    {

        this.accountNumber = accountNumber;
        this.memberLastName = memberLastName;
        this.balanceCdn = balanceCdn;
    }

    /**
     * Provides the functionality to withdraw cash from the account, and updates the balance when called.
     * @param amountCdn: The amount to withdraw.
     */
    void withdraw(final double amountCdn)
    {
        this.balanceCdn -= amountCdn;
    }

    /**
     * Provides the functionality to deposit cash to the account and updates the balance.
     * @param amountCdn: The amount to be deposited into the account.
     */
    void deposit(final double amountCdn)
    {
        this.balanceCdn += amountCdn;
    }

    /**
     * Provides the functionality to transfer to another account.
     * @param amountCdn: Amount to transfer.
     * @param recipientAccount: Account to transfer cash to.
     */
    void transfer(final double amountCdn,
                  final BankAccount recipientAccount)
    {
        recipientAccount.deposit(amountCdn);
        this.withdraw(amountCdn);
    }

    String getAccountNumber()
    {
        return this.accountNumber;
    }

    String getMemberLastName()
    {
        return this.memberLastName;
    }

    double getBalanceCdn()
    {
        return this.balanceCdn;
    }

}
