package DAOInterface;

import java.util.List;

import bean.User;

public interface BankingServices
{
    void addAccount(User user);

    User retireveAccountById(int accNo);

    boolean deposit(int accNo,float amount);

    boolean withdraw(int accNo,float amount);

    boolean transfer(int sender,int receiver,float amount);

    boolean updateAccountDetails(int accNo);

    boolean deleteAccountByAccNo(int accNo);

    List<User> getAllAccounts();
}