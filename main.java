import java.util.Scanner;

        public class Main {
            public static void main(String[] args){

                int yolculukTipi,yas,mesafeyi,toplamTutar;
                double normalTutar,yasİndirimi = 0, indirimliTutar,gidisDonusbileti = 0;

                Scanner input =new Scanner(System.in);

                System.out.print("Mesafeyi Km türünden giriniz :");
                mesafeyi = input.nextInt();
                System.out.print("Yasinizi girinizi :");
                yas = input.nextInt();
                System.out.print("Yolcu tipini giriniz :");
                yolculukTipi = input.nextInt();
                normalTutar = mesafeyi * 0.10;

                if (mesafeyi <= 0) {
                    System.out.println("Hatalı veri girdiniz!");
                }
                if (yolculukTipi != 1 && yolculukTipi != 2) {
                    System.out.println("Hatalı veri girdiniz!");
                }

                if(yas<12){
                    yasİndirimi = normalTutar * 0.50;
                } else if (yas>12 && yas<24) {
                    yasİndirimi = normalTutar * 0.10;
                } else if (yas>65) {
                    yasİndirimi = normalTutar * 0.30;
                }
                indirimliTutar = (normalTutar - yasİndirimi);

                if (yolculukTipi == 2){
                    gidisDonusbileti = indirimliTutar*0.20;
                }
                toplamTutar = (int)(indirimliTutar - gidisDonusbileti)*2;
                System.out.print("Toplam Tutar :"+ toplamTutar);
            }
        }
