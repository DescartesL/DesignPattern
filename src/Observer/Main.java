package Observer;

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();
        Boy1 boy1 = new Boy1();
        Boy2 boy2 = new Boy2();
        Boy3 boy3 = new Boy3();
        girl.addObserver(boy1);
        girl.addObserver(boy3);
        girl.notifyObserver("我好寂寞！");

    }
}
