import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class csisla {
    public static void main(String[] args) {
        //number1();
        //sum2();
        //sredne3();
        //plpryam4();
        //chetne5();
        //fuck6();
        //prostoe7();
        //umno8();
        //bin9();
        //max10();
        //sumn11();
        //palindrome12();
        //koren13();
        //summcif14();
        //perever15();
        //sov16();
        //NOD17();
        //men18();
        //izmznak19();
        //genn20();
        //pro24();

    }

    public static void number1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        System.out.print("Вы ввели: " + a);
        scan.close();
    }

    public static void sum2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("Введите первое число: ");
        int b = scan.nextInt();
        int sum = a + b;
        System.out.print("Сумма ваших чисел равна: " + sum);
        scan.close();
    }

    public static void sredne3() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double one = scan.nextDouble();
        System.out.print("Введите второе число: ");
        double two = scan.nextDouble();
        System.out.print("Введите третье число: ");
        double three = scan.nextDouble();
        double average = (one + two + three) / 3;
        System.out.print("Среднее арифметическое: " + average);
        scan.close();
    }

    public static void plpryam4() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите длину: ");
        double d = scan.nextDouble();
        System.out.print("Введите ширину: ");
        double sh = scan.nextDouble();
        double S = d * sh;
        System.out.print("Площадь прямоугольника: " + S);
        scan.close();
    }

    public static void chetne5() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int chet = scan.nextInt();
        if (chet % 2 == 0) System.out.print("Число четное");
        else System.out.print("Число не четное");
        scan.close();
    }

    public static void fuck6() {
        System.out.print("Введите число пж: ");
        Scanner scan = new Scanner(System.in);
        int f = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= f; i++) {
            factorial *= i;
        }
        System.out.print("Факториал числа равен: " + factorial);
        scan.close();
    }

    public static void prostoe7() {
        Scanner scan = new Scanner(System.in);
        boolean tf = true;
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) tf = false;
        }

        if (tf == true) System.out.print("Число простое");
        else System.out.print("Число составное");
        scan.close();
    }

    public static void umno8() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        System.out.println("Таблица умножения на " + a);

        for (int i = 0; i < 10; i++) {
            System.out.println(a + "x" + (i + 1) + "=" + (a * (i + 1)));
        }
        scan.close();
    }

    public static void bin9() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int bn = scan.nextInt();
        if (bn == 0) System.out.println("0");

        int[] bin = new int[32];
        int r = 0;
        while (bn > 0) {
            bin[r++] = bn % 2;
            bn = bn / 2;
        }
        System.out.print("Число в бинарном виде будет выглядеть как: ");
        for (int i = r - 1; i >= 0; i--) {
            System.out.print(bin[i]);
        }
        scan.close();
    }

    public static void max10() {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[3];
        System.out.print("Введите три числа: ");
        for (int i = 0; i < 3; i++) {
            array[i] = scan.nextInt();
        }
        int max = Arrays.stream(array).max().getAsInt();
        System.out.print("Максимальное число: " + max);

        scan.close();
    }

    public static void sumn11() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число до которого нужно будет найти сумму чисел начиная от 1: ");
        int N = scan.nextInt();
        int summ = N * (N + 1) / 2;
        System.out.print("Сумма чисел от 1 до " + N + " равна " + summ);

        scan.close();
    }

    public static void palindrome12() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = 0;
        int b = scan.nextInt();
        int c = b;
        while (b != 0) {
            int A = b % 10;
            a = (a * 10) + A;
            b = b / 10;
        }
        if (a == c)
            System.out.print("Число " + c + " является полиндромом, т. к, если его перевернуть, то он будет равен " + c);
        else
            System.out.print("Число " + c + " не полиндромное, т.к оно не будет таким же как и прошлое, а будет таким: " + c);

        scan.close();
    }

    public static void koren13() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        double result = Math.sqrt(a);
        System.out.print("Корень из числа " + a + " равен " + result);

        scan.close();
    }

    public static void summcif14() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int oCh = scan.nextInt();
        int SUM = 0;
        while (oCh != 0) {
            SUM += oCh % 10;
            oCh /= 10;
        }
        System.out.print("Сумма чисел равна: " + SUM);

        scan.close();
    }

    public static void perever15() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        int obratnoe = 0;
        while (a != 0) {
            int A = a % 10;
            obratnoe = (obratnoe * 10) + A;
            a = a / 10;
        }
        System.out.print("Обратное число равно " + obratnoe);

        scan.close();
    }

    public static void sov16() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int ARS = scan.nextInt();
        int summa = 0;
        for (int i = 1; i <= ARS / 2; i++) {
            if (ARS % i == 0)
                summa = summa + i;
        }
        if (summa == ARS) System.out.print("Число " + ARS + " является совершенным");
        else System.out.print("Число " + ARS + " не является совершенным");

        scan.close();
    }

    public static void NOD17() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scan.nextInt();
        System.out.print("Введите второе число: ");
        int b = scan.nextInt();
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        System.out.print("НОД равен: " + a);

        scan.close();
    }

    public static void men18() {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.print("Введите два числа: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.print("Минимальное число: " + min);

        scan.close();
    }

    public static void izmznak19() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scan.nextInt();
        int b = a * (-1);
        System.out.print("Изначальное число: " + a + "\nПолученное число: " + b);

        scan.close();
    }

    public static void genn20() {
        int Max = 100;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Число загадано! Можете приступать к отгадыванию!");
        int answer = random.nextInt(Max) + 1;
        boolean cr = false;
        while (!cr) {
            System.out.print("\n\nКак вы считаете, какое это число?: ");
            int stas = scan.nextInt();
            if (stas > answer) {
                System.out.print("Ваше число больше загаданного!");
            } else if (stas < answer) {
                System.out.print("Ваше число меньше загаданного!");
            } else {
                System.out.print("Вы были правы!");
                cr = true;
            }
        }
        scan.close();
    }

    public static void pro24() {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВведите первый член прогрессии: ");
        int first = scan.nextInt();
        System.out.print("Введите количество членов прогрессии: ");
        int N = scan.nextInt();
        System.out.print("Введите разность прогрессии (т.е шаг): ");
        int d = scan.nextInt();

        int Sn = ((2 * first + d * (N - 1)) / 2) * N;
        System.out.print("\n*Сумма первых " + N + " членов арифметической прогрессии равна: " + Sn);
    }
}