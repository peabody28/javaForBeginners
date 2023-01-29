public class AndBinaryOperator extends BinaryOperator
{

    public AndBinaryOperator()
    {
        super('&');
    }
    @Override
    public boolean Execute(boolean a, boolean b) {
        return a & b;
    }
}
