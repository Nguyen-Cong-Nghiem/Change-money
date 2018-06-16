import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner sc =new Scanner(System.in);
        System.out.println("hay nhap so tien cua ban gia tri bang USD: ");
        double money;
        money = sc.nextDouble();
        double moneychange;
        moneychange = money*rate;
        System.out.println("So tien VND cua ban la: "+moneychange);

    }
}
