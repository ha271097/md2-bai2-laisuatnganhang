import java.util.Scanner;

public class lainganhang {
    public static void main (String[] args){
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter monney");
        money = sc.nextDouble();
        System.out.println("Enter month");
        month = sc.nextInt();
        System.out.println("Enter interset rate");
        interset_rate = sc.nextDouble();
        double total_interset =0;
        for(int i=0;i<month;i++){
            total_interset += money*(interset_rate/100)/12*month;
        }
        System.out.println("Totol interset = " + total_interset);
    }
}
