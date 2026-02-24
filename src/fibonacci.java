import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);


        int n=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int count=2;

        while (count<=n) {
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);

        scanner.close();


    }
}
