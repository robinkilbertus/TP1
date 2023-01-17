package tp1;
import java.util.Scanner;
public class exercice1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int note1, note2, note3;

    System.out.println("Saisissez la 1ere note");
    note1=sc.nextInt();

    System.out.println("Saisissez la 2nde note");
    note2=sc.nextInt();

    System.out.println("Saisissez la 3eme note");
    note3=sc.nextInt();

    float moyenne=(note1+note2+note3)/3;
    System.out.println(moyenne);
}
}
