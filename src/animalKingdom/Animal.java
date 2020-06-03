package animalKingdom;

abstract class Animal 
{
    protected int id;
    protected String name;
    protected int discovered;
    protected int stomach;
    
    abstract String getName();

    void consume(int food)
    {
        stomach =+ food;
    }

    void move();
    void breathe();
    void reproduce();
}