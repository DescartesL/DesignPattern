package Observer;

public class Boy1 implements Observer{
    @Override
    public void notify(String msg) {
        System.out.println("Boy1收到: " + msg);
    }
}
