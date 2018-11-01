import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Summator sum = new Summator();
        System.out.print("Введите первое слагаемое: ");
        sum.setFirstNumber(in.nextBigInteger());
        System.out.print("Введите второе слагаемое: ");
        sum.setSecondNumber(in.nextBigInteger());
        System.out.print("Сумма равна: ");
        BigInteger result = sum.sum();
        System.out.print(result);
    }
}