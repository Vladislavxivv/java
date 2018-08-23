import java.util.Scanner;

public class MyKonkat {
    public static void main(String[] args){

    Scanner stroka1 = new Scanner(System.in);
    Scanner stroka2 = new Scanner(System.in);
    Scanner stroka3 = new Scanner(System.in);

    System.out.println("Enter 1st string: ");
    String s1 = stroka1.nextLine();
    System.out.println("Enter 2st string: ");
    String s2 = stroka2.nextLine();
    System.out.println("Enter 3rd string: ");
    String s3 = stroka3.nextLine();

    System.out.println(s1+" "+s3); // можно и без пробелов, но мне так не очень)
    System.out.println(s3+" "+s2+" "+s1);
    System.out.println(s1+" "+s2+" "+s3);

    }
}
