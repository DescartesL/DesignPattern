package Chain;

public abstract class AbstractChain {
    AbstractChain nextChain;

    public void Execute(String msg){
        write(msg);
        if(nextChain != null){
            nextChain.Execute(msg);
        }
    }

    public void setNextChain(AbstractChain chain){
        this.nextChain = chain;
    }

    abstract void write(String msg);


}
