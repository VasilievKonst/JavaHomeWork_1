import java.util.Scanner;

public class Hometask {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int a = Scanner.nextInt();
        Scanner.close();
        System.out.println("Треугольное число = " + result(a) + "\n");
    }

    public static int result(int num) {
        if (num == 1) {
            return 1;
        }
        return result(num - 1) + num;
    }
}