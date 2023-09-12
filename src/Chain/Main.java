package Chain;

public class Main {
    public static void main(String[] args) {
        AbstractChain firstChain = new FirstChain();
        AbstractChain secondChain = new SecondChain();
        AbstractChain thirdChain = new ThirdChain();

        firstChain.setNextChain(secondChain);
        secondChain.setNextChain(thirdChain);

        firstChain.Execute("Hello World!");
    }
}
