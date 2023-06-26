package coreJava10.bankTask;

import coreJava8.ManagerImpl;
import coreJava8.UserImpl;
import corejava4.Address;

import java.util.ArrayList;
import java.util.List;

class Bank {
    List<UserImpl> listOfAccounts = new ArrayList<>(10);
    List<ManagerImpl> listOfManagers = new ArrayList<ManagerImpl>(3);
    Authenticate authenticate;
    ChatBot chatBot;

    public Bank() {
        listOfAccounts.add(new UserImpl("AB1001", "password", 200000,
                new Address("Cynthia Drive", "3289", "2", "Bing", 13905)));
        listOfAccounts.add(new UserImpl("AB1002", "password", 305000,
                new Address("Cynthia Drive", "3276", "3", "Bing", 13902)));
        listOfAccounts.add(new UserImpl("AB1003", "password", 400005,
                new Address("Cynthia Drive", "3289", "2", "Bing", 13905, "8714812764", "6075632765")));
        listOfAccounts.add(new UserImpl("AB1004", "password", 870000,
                new Address("Sylvia Drive", "3243", "9", "Bing", 13905)));
        listOfAccounts.add(new UserImpl("AB1005", "password", 980000,
                new Address("Madison Drive", "289", "1", "NYC", 10005)));
        listOfManagers.add(new ManagerImpl("M1001", "mpassword"));
        listOfManagers.add(new ManagerImpl("M1002", "mpassword"));
        listOfManagers.add(new ManagerImpl("M1003", "mpassword"));
        authenticate = new Authenticate(listOfAccounts, listOfManagers);
        chatBot = new ChatBot(authenticate);
    }

    void start() {
        chatBot.start();
    }


}
