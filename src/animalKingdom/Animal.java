package animalKingdom;

abstract class Animal 
{
    protected String name;
    protected int stomach;
    protected int discovered;
    public Animal()
    {
        stomach = 1;
    }
    public Animal(String name, int stomach, int discovered)
    {
        this.name = name;
        this.stomach = stomach;
        this.discovered = discovered;
    }

    void move()
    {
        stomach--;
    }

    int getStomach() {
        return stomach;
    }

    String getName()
    {
        return name;
    }
    void consume(int food)
    {
        stomach =+ food;
    }

    int getDiscovered() {
        return discovered;
    }
     

    @Override
    public String toString()
    {
        return "Animal: " + "Name: " + name + " Discovered: " + discovered;
    }
}