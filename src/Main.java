import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно еще немного подождать");
        }
        //Задача 2
        int temperature = 3;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        } else {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }
        //Задача 3
        int speed = 58;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //Задача 4
        int ageHuman = 17;
        if (ageHuman >= 2 && ageHuman <=6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        } else if (ageHuman >=7 && ageHuman <=17){
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        } else if (ageHuman >= 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в университет");
        } else if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить на работу");
        }
        //Задача 5
        int ageKid = 14;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему нельзя кататься на аттракционе");
        } else if (ageKid >=5 && ageKid <14) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (ageKid >= 14) {
            System.out.println("Если возраст ребенка равен " + ageKid + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        //Задача 6
        int numberOfPeople = 10;
        int capacityVan = 102;
        int sedentaryPlacesVan = 60;
        int standingPlaceVan = capacityVan - sedentaryPlacesVan;
        int leftStandingPlaceVan = standingPlaceVan - (numberOfPeople - sedentaryPlacesVan);
        int leftSedentaryPlaceVan = sedentaryPlacesVan - numberOfPeople;
        if (numberOfPeople >= capacityVan) {
            System.out.println("Количество людей в вагоне " + capacityVan + ", вагон полностью забит");
        } else if (numberOfPeople <= capacityVan && numberOfPeople >= sedentaryPlacesVan) {
            System.out.println("Количество людей в вагоне " + numberOfPeople + ", в вагоне есть " + leftStandingPlaceVan + " стоячих мест");
        } else if (numberOfPeople <= capacityVan && numberOfPeople < sedentaryPlacesVan) {
            System.out.println("Количество людей в вагоне " + numberOfPeople + ", в вагоне есть " + leftSedentaryPlaceVan + " сидячих мест и " + standingPlaceVan + " стоячих мест");
        }
        //Задача 7
        int one = 3;
        int two = 4;
        int three = 8;
        if (one > two && one > three){
            System.out.println(one);
        } else if (two > one && two > three) {
            System.out.println(two);
        } else if (three > two && three > one) {
            System.out.println(three);
        }
    }
}