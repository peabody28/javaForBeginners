public class XorBinaryOperator extends BinaryOperator
{
    public XorBinaryOperator()
    {
        super('^');
    }

    @Override
    public boolean Execute(boolean a, boolean b) {
        return a ^ b;
    }
}
