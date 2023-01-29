public class OrBinaryOperator extends BinaryOperator
{
    public OrBinaryOperator()
    {
        super('|');
    }
    @Override
    public boolean Execute(boolean a, boolean b) {
        return a | b;
    }
}
