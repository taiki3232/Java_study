import java.util.Scanner;
import java.util.ArrayList;

public class BMIcalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> history = new ArrayList<>();

        while (true) {
            System.out.println("名前を入力してください");
            String name = sc.next();
            System.out.println("体重(kg)を入力してください");
            double w = sc.nextDouble();
            System.out.println("身長(m)を入力してください(例:1.7)");
            double h = sc.nextDouble();
            User tanaka = new User(name, w, h);

            double bmi = tanaka.calcBMI();

            System.out.println("あなたのBMIは" + Math.floor(bmi) + "です");

            if (bmi < 18.5) {
            System.out.println("痩せ型です");
                } else if (bmi >= 25) { 
                    System.out.println("肥満です");
                    } else {
                        System.out.println("標準体型です");
                        }

            history.add(tanaka);

            System.out.println("もう一度計算しますか？ (y/n)");
            String check = sc.next();
            if (check.equals("n")) { 
                System.out.println("終了します");
                break;
            }
        }

        System.out.println("--測定結果--");
        for (User u : history) { 
            System.out.println("氏名:" + u.getName() + " 身長:" + u.getHeight() + " 体重:" + u.getWeight() + " BMI:" + (int)Math.floor(u.calcBMI()));
        }
    }
}