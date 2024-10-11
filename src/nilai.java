import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("masukan nilai ");
        int nilai = input.nextInt();

        String predikat;
        if (nilai >= 85){predikat = "A";
    } else if (nilai >= 75){predikat = "B";
    }else if (nilai >= 65){predikat = "c";
    }else if (nilai >= 55){predikat = "d";
    }else {
        predikat = "e";
    }
    System.out.println("predikat " + predikat);
    input.close();

    }
    
}
