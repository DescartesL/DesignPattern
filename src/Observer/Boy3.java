package Observer;

public class Boy3 implements Observer{
    @Override
    public void notify(String msg) {
        System.out.println("Boy3收到: " + msg);
    }
}
