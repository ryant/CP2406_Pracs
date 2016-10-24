/**
 * Created by Ryan Thorp.
 */
public class NonMetalElement extends Element
{
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight)
    {
        super(symbol, atomicNumber, atomicWeight);
    }
    public void describeElement()
    {
        System.out.println("A nonmetal, like " + getSymbol() +
                " with atomic number " + getAtomicNumber() +
                " and an atomic weight of " + getAtomicWeight() +
                "\n    is a poor conductor of electricity");
    }
}
