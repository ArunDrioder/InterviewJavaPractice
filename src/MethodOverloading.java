public class MethodOverloading
{
    //This is method overloading, here the int add () method has been called 2 times with different number of
    // parameters & as well as data-type of the parameters

    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();
        System.out.println(overloading.add(4,5));
        System.out.println(overloading.add(5,6,7));


    }

    public int add(int a, int b)
    {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c)
    {
        return a + b + c;
    }
    public double add(double a, double b)
    {
        return a + b;
    }
}
