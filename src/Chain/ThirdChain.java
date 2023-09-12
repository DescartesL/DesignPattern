package Chain;

public class ThirdChain extends AbstractChain{
    @Override
    void write(String msg) {
        System.out.println("ThirdChain: " + msg);
    }
}
