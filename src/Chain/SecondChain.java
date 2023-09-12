package Chain;

public class SecondChain extends AbstractChain{
    @Override
    void write(String msg) {
        System.out.println("SecondChain: " + msg);
    }
}
