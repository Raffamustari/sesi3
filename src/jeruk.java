
public class jeruk {
    
    public static void main(String[] args) {
        int JUMLAHbuah = 23, buah_sisa_5, buah_sisa_2, harga_sisa_5, harga_sisa_2, harga_buah_5, harga_buah_2, harga_buah_1, harga_5 = 10000, harga_2 = 5000, harga_1 = 3000,total;
        
        harga_buah_5 = JUMLAHbuah / 5 * harga_5;

        buah_sisa_5 = JUMLAHbuah % 5;

        harga_buah_2 = buah_sisa_5 / 2 * harga_2;

        buah_sisa_2 = buah_sisa_5 % 2;

        harga_buah_1 = buah_sisa_2 = buah_sisa_2 / 1 * harga_1;

        total = harga_buah_5 + harga_buah_2 + harga_buah_1;
            System.out.println(total);
    }
}
