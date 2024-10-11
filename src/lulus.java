import java.util.Scanner;
    public class lulus{
        public static void main(String[] args) {
            Scanner oi = new Scanner(System.in);
            System.out.println("nilai siswa ");
            int nilai  = oi.nextInt();

            if  (nilai>= 75) {
                System.out.println("lulus");
            } else {
                System.out.println("tidak lulus");
            oi.close();
            }

        }
    }