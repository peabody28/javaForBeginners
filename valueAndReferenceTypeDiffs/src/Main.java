class Car
{
    public int speed;

    public Car(int _s) { speed = _s; }
}

// класс-оболочка для int
class IntegerWrapper
{
    public int value;

    public IntegerWrapper(int _v) {value = _v;}
}

public class Main {

    // если параметр является классом, он "передается по ссылке"
    // таким образом изменение объекта данным методом, изменит его и в вызывающем коде (main)
    public static void ChangeReferenceType(Car obj)
    {
        obj.speed *= 2;
    }

    // int не является классом, поэтому данный метод работает с копией и в вызывающем коде переменная не изменится
    public static void ChangeValueType(int a)
    {
        a *= 2;
    }

    // чтобы передать значимый тип (не класс) по ссылке,
    // нужно создать класс-обертку и поместить туда наше значение
    public static void ChangeValueTypeByReference(IntegerWrapper obj)
    {
        obj.value  *= 2;
    }

    public static void main(String[] args)
    {
        // в переменной obj хранится ссылка на объект класса Car,
        // поэтому копируя эту ссылку в разные методы, все они будут работать с одним и тем же объектом в куче
        var obj = new Car(120);
        System.out.println("car speed: " + obj.speed); // 120
        ChangeReferenceType(obj);
        System.out.println("car speed after Change: " + obj.speed); // 140

        // переменная value не является ссылкой, поэтому в всех методах будет ее копия
        int value = 5;
        System.out.println("value: " + value); // 5
        ChangeValueType(value);
        System.out.println("value after Change: " + value); // 5

        // тот же случай, что и переменная obj. В refInt хранится ссылка на IntegerWrapper
        var refInt = new IntegerWrapper(6);
        System.out.println("refInt: " + refInt.value); // 6
        ChangeValueTypeByReference(refInt);
        System.out.println("refInt after Change: " + refInt.value); // 12
    }
}