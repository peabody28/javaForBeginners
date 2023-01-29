public class Main
{
    public static void main(String[] args)
    {

        var binaryOperators = new BinaryOperator[]
        {
            new OrBinaryOperator(),
            new AndBinaryOperator(),
            new XorBinaryOperator()
        };

        for (var bOperator : binaryOperators)
        {
            System.out.println(bOperator.symbol);
            bOperator.ShowTable();
        }
    }
}