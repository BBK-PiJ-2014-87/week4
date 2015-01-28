
import java.util.Scanner;

public class Test {

    static boolean isValidUser(String name) {
        boolean loginIsValid = true;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            System.out.println(c);
            if (!Character.isLetter(c) || !Character.isLowerCase(c)) {
                loginIsValid = false;
            }
        }
        if(!loginIsValid){
            System.out.println("Innvalid user name");
        }else{
            System.out.println("Login is valid");
        }
        return loginIsValid;
    }


    public static void main(String[] args) {
        String mystring = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a user name");
        mystring = in.nextLine();
        isValidUser(mystring);

    }

}

