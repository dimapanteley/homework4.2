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
        int age = 17;
        if (age >= 18)
            System.out.println("человек совершенно летний ");
        if (age <= 18) {
            System.out.println("не достиг совершеннолетия, нужно немного подождать ");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int temperaturao = 3;
        int temperatrap = 5;
        if (temperaturao < temperatrap) {
            System.out.println("На улице " + temperaturao + " холодно, нужно надеть шапку");
        } else {
            System.out.println("На улице  тепло " + temperaturao + " можно идти без шапки");


        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 45;
        int mspeed = 70;
        if (speed < mspeed) {
            System.out.println(" Если скорость " + speed + " можно ездить спокойно ");
        } else {
            System.out.println(" Если скорость " + speed + " придется заплатить штраф ");

        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 5;
        if (age > 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить  в садик");
        } else if (age > 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить  в школу ");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить  в университет ");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить  на работу ");


        }


    }

    public static void task5() {
        System.out.println("Задача 5");

        int smallAge = 4;
        if (smallAge < 5) {
            System.out.println("Если возраст ребенка равен" + smallAge + "нельзя кататься на аттракционе нельзя ");
        } else if (smallAge > 5 && smallAge < 14) {
            System.out.println("Если возраст человека равен " + smallAge + " то ему нужно ходить кататься на атракцион в сопровождении взрослого.Если взрослого нет, то кататься нельзя");
        } else if (smallAge > 14) {
            System.out.println("Если возраст человека равен " + smallAge + " то ему нужно ходить кататься на атракцион самостоятельно ");


        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int wagonCapacity = 102;
        int seatPlace = 60;
        int capacity = 105;
        if (seatPlace > capacity && capacity < wagonCapacity) {
            System.out.println("В вагоне есть сидячие места");
        } else if (seatPlace < capacity && capacity < wagonCapacity) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет свободных мест");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 50;
        int two = 12;
        int three = 130;
        if (one > two && three < one) {
            System.out.println("Число " + one + " самое большое ");
        } else  if ( two > one && three < two) {
            System.out.println(" Число " + two + " самое большое ");
        } else {
            System.out.println(" Число " + three + " самое большое");

        }




    }

}







