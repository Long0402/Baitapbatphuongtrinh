package batphuongtrinh;

import java.util.Scanner;

public class Batphuongtrinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        if(a==0&&b==0){
            System.out.println("Phuong trinh vo so nghiem");
        }
        else if(a==0&&b!=0)
        {
            System.out.println("Phuong trinh vo nghiem");
        }
        else System.out.println("Phuong trinh co nghiem la: x="+(double)(-b/a));
    }
    
}
