public class Aksi {

        public static void main(String[] args) {
            Motor motor1 = new Motor();
            motor1.merek = "Honda";
            motor1.harga = 2100.00;
            motor1.tahun = "2018";

            Motor motor2 = new Motor();
            motor2.merek = "Yamaha";
            motor2.harga = 3000.00;
            motor2.tahun = "2019";

            Motor motor3 = new Motor();
            motor3.merek = "Suzuki";
            motor3.harga = 1600.00;
            motor3.tahun = "2017";

            System.out.println("List Harga Motor Bekas");
            System.out.println("============================================");
            motor1.info();
            System.out.println("Harga + Pajak : " + (motor1.harga + (motor1.harga * 0.10)) );
            System.out.println("============================================");

            motor2.info();
            System.out.println("Harga + Pajak : " + (motor2.harga + (motor2.harga * 0.10)) );
            System.out.println("============================================");

            motor3.info();
            System.out.println("Harga + Pajak : " + (motor3.harga + (motor3.harga * 0.10)) );
            System.out.println("============================================");

        }
}
