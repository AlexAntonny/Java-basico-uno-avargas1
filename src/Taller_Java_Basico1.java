import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a,b,c;
        while (true) {
        System.out.print(" Digite valor A:");
        Scanner scanner1 = new Scanner(System.in);
        a = scanner1.nextInt();
        System.out.println(a);
        System.out.print(" Digite valor B:");
        Scanner scanner2 = new Scanner(System.in);
        b = scanner2.nextInt();
        System.out.println(b);
        System.out.print(" Digite valor C:");
        Scanner scanner3 = new Scanner(System.in);
        c = scanner3.nextInt();
        System.out.println(c);

        if (a == b || a==c || b== c) {
            System.out.println("Advertencia: los valores digitados deben ser diferentes , digitelos nuevamente");

        } else {
            break;
        }
        }
            int mayor=a;
            int menor=a;

            if (b>mayor){
                mayor=b;
            }
            if (c>mayor){
                mayor=c;
            }
            if (b<menor){
                menor=b;
            }
            if (c<menor){
                menor=c;
            }
        System.out.println ("El numero mayor es:"+mayor);
        System.out.println ("El numero menor es:"+menor);

    }


}