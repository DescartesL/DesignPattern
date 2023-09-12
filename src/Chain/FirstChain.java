package Chain;

public class FirstChain extends AbstractChain{
    @Override
    void write(String msg) {
        System.out.println("FirstChain: " + msg);
    }
}
