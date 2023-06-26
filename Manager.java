package coreJava8;

import java.util.List;
import java.util.Scanner;

public interface Manager {
    UserImpl[] addUser(Scanner scanner,UserImpl[] listOfAccounts,int noOfUsers);
    List<UserImpl> addUser(List<UserImpl> listOfAccounts);
    void listUsers(UserImpl[] listOfAccounts);
    public void listUsers(List<UserImpl>listOfAccounts);
}
