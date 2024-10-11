import java.util.Scanner;

public class uang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukan uang (rupiah)");
        int jumlahd = input.nextInt(); 

        int[] pecahan = {100000, 50000, 20000 ,10000 ,5000, 2000, 1000, 500,100};

        System.out.println("pecahan uang:");
        for (int i = 0; i < pecahan.length; i++)
        {int jumlahLebar = jumlahd / pecahan [i] ;
            if (jumlahLebar > 0) {
                System.out.println(jumlahLebar + "lembar" + pecahan[i]);

            }
            jumlahd %= pecahan [i];
            input.close();
        }
    }
}

        

      