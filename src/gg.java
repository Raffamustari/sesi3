import java.util.Scanner;

public class gg {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
        System.out.println("masukan angka");
        int no = input.nextInt();

        if (no % 2 == 0) {
            System.out.println(no + "genap");
        }else
        System.out.println(no + "ganjil");
        input.close();
    }
}
