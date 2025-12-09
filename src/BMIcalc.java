import java.util.Scanner;

public class BMIcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("体重(kg)を入力してください");
        int weight = sc.nextInt();
        System.out.println("身長(m)を入力してください(例:1.7)");
        double height = sc.nextDouble();
        int BMI = (int) Math.floor(weight / (height * height));

        System.out.println("あなたのBMIは" + BMI + "です");

        if (BMI < 18.5) {
            System.out.println("痩せ型です");
        } else if (BMI >= 25) { 
            System.out.println("肥満です");
        } else {
            System.out.println("標準体型です");
        }
    }
}
