import java.util.Scanner;

public class ReverseaNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number:");
        int  num=scanner.nextInt();
        int ans=0;

        while(num>0){
            int rem = num%10;
            num/=10;
            ans =ans*10+rem;

        }
        System.out.println(ans);

    }
}
