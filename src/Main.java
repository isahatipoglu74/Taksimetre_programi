import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);


        double km,tutar,baslangic=10;

        System.out.print("Mesafeyi giriniz(km) :");

        km= input.nextDouble();
        tutar=baslangic+km*(2.20);

        if(tutar>20){
            System.out.print("Ödenecek tutar:"+tutar);
        }
       else{
            System.out.print("Ödecenek tutar:20 TL");
        }
    }
}