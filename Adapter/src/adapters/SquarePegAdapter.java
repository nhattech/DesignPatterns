package adapters;

import round.RoundPeg;
import square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes.
 * input is edge of square peg, output is radius of round peg
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this peg.
        //r = sqrt( ((a/2)^2)*2 )
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}