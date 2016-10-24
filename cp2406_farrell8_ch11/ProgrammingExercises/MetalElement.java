/**
 * Created by Ryan Thorp.
 */
public class MetalElement extends Element
{
    public MetalElement(String symbol, int atomicNumber, double atomicWeight)
    {
        super(symbol, atomicNumber, atomicWeight);
    }
    public void describeElement()
    {
        System.out.println("A metal, like " + getSymbol() +
                " with atomic number " + getAtomicNumber() +
                " and an atomic weight of " + getAtomicWeight() +
                "\n    is a good conductor of electricity");
    }
}
