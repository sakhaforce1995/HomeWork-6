public class Main{
    public static void main(String[] args){
        homework1task1();
        homework1task2();
        homework1task3();
        homework1task4();
        homework2task1();
        homework2task2();
        homework2task3();
        homework3task1();
    }
    public static void homework1task1(){
        //Часть 1 Задание 1
        System.out.println("Часть 1 Задание 1");
        for  (int i=1; i <= 10; i++){
            System.out.println("Интерация цикла " + i);
        }
    }
    public static void homework1task2(){
        //Часть 1 Задание 2
        System.out.println("Часть 1 Задание 2");
        for  (int i=10; i >= 1; i--){
            System.out.println("Интерация цикла " + i);
        }
    }
    public static void homework1task3(){
        //Часть 1 Задание 3
        System.out.println("Часть 1 Задание 3");
        for (int i=0; i <=17; i = i + 2){
            System.out.println("Интерация цикла " + i);
        }
    }
    public static void homework1task4(){
        //Часть 1 Задание 4
        System.out.println("Часть 1 Задание 4");
        for (int i=10; i >= -10; i--){
            System.out.println("Интерация цикла " + i);
        }
    }
    public static void homework2task1(){
        //Часть 2 Задание 1
        System.out.println("Часть 2 Задание 1");
        for(int i = 1904; i <= 2096; i = i + 4 ){
            System.out.println("Високосный год " + i);
        }
    }
    public static void homework2task2(){
        //Часть 2 Задание 2
        System.out.println("Часть 2 Задание 2");
        for(int i = 7; i <= 98; i += 7){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void homework2task3(){
        //Часть 2 Задание 3
        System.out.print("Часть 2 Задание 3");
        int number = 1;
        System.out.println(number + " ");
        for (int i = 0; i < 9; i++) {
            number = number * 2;
            System.out.print(number + " ");
        }
        System.out.println();

    }
    public static void homework3task1(){
        //Часть 3 Задание 1
        System.out.println("Часть 3 Задание 1");
        int salary = 29000;
        int total = 0;
        for(int i = 0; i < 12; i++){
            total += salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //Часть 3 Задание 2
        System.out.println("Часть 3 Задание 3");
        double sumWithPercent = 0;
        double percent = 0.01;
        for(int i = 0; i < 12; i++){
            sumWithPercent = (sumWithPercent + salary) * (1 + percent);
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumWithPercent + " рублей");

        }
    }

}