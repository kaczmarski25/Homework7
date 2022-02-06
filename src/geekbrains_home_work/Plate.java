package geekbrains_home_work;

public class Plate extends Main{

    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood() {
        this.food += 450;
        System.out.println("Добавляем в  миску 450 гр. корма");
    }
    public boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}
