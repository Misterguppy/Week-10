import java.util.*;
public class Monogram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your first name: ");
        String first = input.nextLine();
        System.out.print("Enter Your middle initial: ");
        String middle = input.nextLine();
        System.out.print("Enter Your last name: ");
        String last = input.nextLine();
        String fname = first.substring(0,1);
        String mname = middle.substring(0,1);
        String lname = last.substring(0,1);
        fname = fname.toLowerCase();
        mname = mname.toLowerCase();
        input.close();
        System.out.println(fname+lname+mname);
    }
}
