public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int age = 19;

        if (age >= 18) {
            System.out.println("Вам 18, или больше лет!");
        } else {
            System.out.println("Вам еще нет 18, нужно немного подождать =)");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int temperature = 4;

        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градуса, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");

        int speed = 4;

        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int age = 25;

        if (age > 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        else {
            if (age > 18){
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
            }
            else {
                if (age >= 7) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
                }
                else {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
                }
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int age = 15;

        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        } else {
            if (age > 5) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе.");
            }
        }

    }

    public static void task6() {
        System.out.println("Задача 6");

        int capacity = 102;
        int seatPlace = 60;
        int standingPlace = capacity - seatPlace;

        int occupiedSeatPlace = 59;
        int occupiedStandingPlace = 41;
        boolean wagonFull = occupiedSeatPlace + occupiedStandingPlace == capacity;
        
        if (wagonFull) {
            System.out.println("Вагон забит!");
        }
        else {
            if (occupiedSeatPlace == seatPlace){
                System.out.println("В вагоне " + (standingPlace - occupiedStandingPlace) + " стоячих мест.");
            }
            else if (occupiedStandingPlace == standingPlace) {
                System.out.println("В вагоне " + (seatPlace - occupiedSeatPlace) + " сидячих мест.");
            }
            else {
                System.out.println("В вагоне " + (standingPlace - occupiedStandingPlace) + " стоячих мест и "
                        + (seatPlace - occupiedSeatPlace) + " сидячих мест.");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");

        int one = 2345232;
        int two = 43245;
        int three = 788323;
        int min;

        if (one < two){
            min = one;
        }
        else {
            min = two;
        }

        if (min > three) {
            min = three;
        }

        System.out.println("Наименьшее число: " + min);
    }


}