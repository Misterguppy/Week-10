/**Emet Park
 * 4/15/24
 */
import java.util.*;
public class AccountSetup {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a user name: ");
        String user = input.nextLine();
        boolean fort = false; 
        String password = "a";
        while(!fort){
            System.out.print("Enter a password that is at least 8 characters: ");
            password = input.nextLine();
            int indexp = password.length();
            if(indexp >= 8){
                fort = true;
            }
        }
        
        input.close();
        System.out.println("Your user name is "+user+"and your password is "+ password);
    }
}