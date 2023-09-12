package Adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        System.out.println(hole.fits(peg));
        SquarePeg smallSquarePeg = new SquarePeg(5);
        // This will not compile
        // System.out.println(hole.fits(smallSquarePeg));
        SquarePeg largeSquarePeg = new SquarePeg(10);
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println(hole.fits(smallSquarePegAdapter));
        System.out.println(hole.fits(largeSquarePegAdapter));

    }
}
