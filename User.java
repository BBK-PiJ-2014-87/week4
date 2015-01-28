
import java.util.Scanner;

public class User {
    String userName;


    String requestUserName(){
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        return userName;
    }

    public User(String userName){
        this.userName = userName;
    }

    public User(){
        System.out.println("Please enter a user name");
        userName = requestUserName();
        while(!isValidUser(userName)){
            System.out.println("Invalid user name. Please try one more time");
            userName = requestUserName();
        }


    }


    boolean isValidUser(String name){
        boolean loginIsValid = true;
        for (int i=0; i < name.length(); i++){
            char c = name.charAt(i);
            if(!Character.isLetter(c) || !Character.isLowerCase(c)){
                loginIsValid=false;
            }

        }
        return loginIsValid;
    }
}

