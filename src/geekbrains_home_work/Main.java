package geekbrains_home_work;

public class Main {

    public static void main(String[] args) {
        int time = 0;
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Пушистик", 140, 5);
        cat[1] = new Cat("Лорик", 120, 4);
        cat[2] = new Cat("Матроскин", 100, 3);
        Plate plate = new Plate(500);
        System.out.println("В миске было " + plate.getFood() + " кошачьего корма.");
        System.out.println("У хозяина три кота: " + cat[0].getName() + ", " + cat[1].getName() + ", и " + cat[2].getName()
                + ", которые хотят есть каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime() + ", и " + cat[2].getSatietyTime()
                + " час(а/ов).");


            for (Cat i : cat) {
                if (i.getSatiety() == 0) {

                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() +
                            " корма ,следующая кормежка у него через " + (i.getSatiety()) + " часа(ов)");
                }
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("С момента начала кормежки прошел(ло) " + time + " час(а). В миске осталось " + plate.getFood() + " гр. корма.");
            time++;

        }

}

