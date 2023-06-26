package coreJava10.bankTask;

import coreJava8.ManagerImpl;
import coreJava8.UserImpl;

import java.util.List;

public class Authenticate {
    List<UserImpl> listOfusers;
    List<ManagerImpl> listOfManagers;
    Authenticate(List<UserImpl> users,List<ManagerImpl> managers){
        this.listOfManagers = managers;
        this.listOfusers = users;
    }
    UserImpl searchUser(String username) {
        for (UserImpl user : listOfusers) {
            if (username.equals(user.getUserName())) return user;
        }
        return new UserImpl("No User");
    }
    ManagerImpl searchManager(String username) {
        for (ManagerImpl manager : listOfManagers) {
            if (username.equals(manager.getUserName())) return manager;
        }
        return new ManagerImpl("No Manager");
    }
    boolean isAuthenticated(UserImpl user, String uname,String password){
        return user.authenticate(uname,password);
    }
    boolean isAuthenticated(ManagerImpl manager, String uname,String password){
        return manager.authenticate(uname,password);
    }
}
