package animalKingdom;

public class AbstractAnimal 
{
    protected int id;
    protected String name;
    protected int discovered;
    protected int stomach;
    
    void consume(int food)
    {
        stomach =+ food;
    }

    void move();
    void breathe();
    void reproduce();
}