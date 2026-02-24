import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char ch;

        System.out.print("Enter an Character: ");
        ch=scanner.next().trim().charAt(0);

        if (ch>'a' && ch<='z' ){
            System.out.println("lowercase");
        }
        else {
            System.out.println("Uppercase");
       }




    }
}
