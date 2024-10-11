public class BUAH {
        public static void main(String[] args) {
            
            int totalbuah = 90;
            int harga_1_buah = 5000;
            int totalharga = 0;

            totalharga = totalbuah *harga_1_buah;

            if (totalbuah > 10) {
                    int diskon = totalharga  / 10;
                    System.out.println("dapat diskon sebsar rp" + diskon); }
                System.out.println("harga RP " + totalharga );
            }
        }
