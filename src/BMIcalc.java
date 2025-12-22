import java.util.Scanner;

public class BMIcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("体重(kg)を入力してください");
            double w = sc.nextDouble();
            System.out.println("身長(m)を入力してください(例:1.7)");
            double h = sc.nextDouble();
            User tanaka = new User(w, h);

            double bmi = tanaka.calcBMI();

            System.out.println("あなたのBMIは" + Math.floor(bmi) + "です");

            if (bmi < 18.5) {
            System.out.println("痩せ型です");
                } else if (bmi >= 25) { 
                    System.out.println("肥満です");
                    } else {
                        System.out.println("標準体型です");
                        }

            System.out.println("もう一度計算しますか？ (y/n)");
            String check = sc.next();
            if (check.equals("n")) { 
                System.out.println("終了します");
                break;
            }
        }
    }
}