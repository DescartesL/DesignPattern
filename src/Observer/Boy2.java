package Observer;

public class Boy2 implements Observer{
    @Override
    public void notify(String msg) {
        System.out.println("Boy2收到: " + msg);
    }
}
