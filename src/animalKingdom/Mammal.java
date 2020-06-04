package animalKingdom;

public class Mammal extends Animal 
{
    public Mammal(String name, int stomach, int discovered)
    {
        super(name, stomach, discovered);
    }


    @Override
    public String moves(int moved)
    {
        return name + " walks " + moved + " steps";
    }
    @Override
    public String breathes()
    {
        return name + " breathes air through lungs";
    }
    @Override
    public String reproduces()
    {
        return name + " reproduces by giving live birth";
    }
}