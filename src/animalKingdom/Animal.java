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

    abstract String moves(int moved);

    int getStomach() {
        return stomach;
    }

    String getName()
    {
        return name;
    }

    
    void toStomach(int food)
    {
        this.stomach =+ food;
    }

    int getDiscovered() {
        return discovered;
    }

    
    public String consumes(int amount, String food)
    {
        toStomach(amount);
        return name + " eats " + amount + " " + food;
    }

    @Override
    public String toString()
    {
        return "| " + name + " | " + discovered + " |";
    }
}