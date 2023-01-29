public abstract class BinaryOperator
{
    protected char symbol;

    public BinaryOperator(char _s)
    {
        symbol = _s;
    }

    public abstract boolean Execute(boolean a, boolean b);
    public void ShowTable()
    {
        var booleans = new boolean[] {true, false};

        for (boolean a : booleans)
            for(boolean b : booleans)
                System.out.println(a + " " + symbol + " " + b + " = " +  Execute(a,b) );
    }
}