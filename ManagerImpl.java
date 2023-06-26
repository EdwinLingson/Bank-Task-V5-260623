package coreJava8;

import coreJava10.bankTask.TakeInput;
import corejava4.Address;

import java.util.List;
import java.util.Scanner;

public class ManagerImpl extends Person implements Manager{
    public ManagerImpl(String userName, String password) {
        super(userName, password);
    }

    public ManagerImpl(String userName) {
        super(userName);
    }

    @Override
    public boolean authenticate(String mname, String password) {
        if(mname.equals("No User")) return false;
        return mname.equals(getUserName()) && password.equals(getPassword());
    }
    UserImpl createUserbject(){
        System.out.println("Enter UserName for new User");
        String newUsername = TakeInput.readString();
        System.out.println("Enter Password for new User");
        String newPassword = TakeInput.readString();
        System.out.println("Enter Initial deposit");
        int balance = TakeInput.nullCheck(TakeInput.readInteger());
        //String name, String doorNo, String streetNo, String locality, int zipcode
        System.out.println("Enter Street name of address for new User");
        String newStreetName = TakeInput.readString();
        System.out.println("Enter Door No for new User");
        String newDoorNo = TakeInput.readString();
        System.out.println("Enter Street No for new User");
        String newStreetNo = TakeInput.readString();
        System.out.println("Enter Locality for new User");
        String newLocality = TakeInput.readString();
        System.out.println("Enter Zipcode for new User");
        int newZipcode = TakeInput.nullCheck(TakeInput.readInteger());

        Address newAddress = new Address(newStreetName,newDoorNo,newStreetNo,newLocality,newZipcode);
        return new UserImpl(newUsername,newPassword,balance,newAddress);
    }
    @Override
    public UserImpl[] addUser(Scanner scanner,UserImpl[] listOfAccounts,int numberOfUsers) {

        listOfAccounts[numberOfUsers] = createUserbject();

        return listOfAccounts;

    }

    @Override
    public List<UserImpl> addUser(List<UserImpl> listOfAccounts) {
        listOfAccounts.add(createUserbject());
        return  listOfAccounts;
    }

    @Override
    public void listUsers(UserImpl[] listOfAccounts) {
        for (UserImpl user:listOfAccounts) {
            if(user!=null)
                user.displayDetailsWithBalance();
        }
    }
    @Override
    public void listUsers(List<UserImpl>listOfAccounts) {
        for (UserImpl user:listOfAccounts) {
            user.displayDetailsWithBalance();
        }
    }
}
