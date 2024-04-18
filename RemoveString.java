import java.util.*;
public class RemoveString {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        input.close();
        String nextsentence= sentence.replace(" "+word,"");
        System.out.println(nextsentence);
    }
}
