public class MethodOverriding
{

    //In the main method, we create an Animal object and a Dog object (although referenced as Animal).
    // When makeSound is called on myAnimal, it uses the Animal class's method. When makeSound is called on myDog, it uses the overridden method in the Dog class.
    public static void main(String[] args)
    {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        myAnimal.makeSound();
        myDog.makeSound();

    }
}
