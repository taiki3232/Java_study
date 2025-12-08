import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        System.out.println("あなたの名前は" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");
    }
}
