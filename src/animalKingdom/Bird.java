package animalKingdom;

public class Bird extends Animal 
{
    public Bird(String name, int stomach, int discovered)
    {
        super(name, stomach, discovered);
    }
    @Override
    public String moves(int moved)
    {
        return name + " flies " + moved + " miles";
    }
    @Override
    public String breathes()
    {
        return name + " breathes air through lungs";
    }
    @Override
    public String reproduces()
    {
        return name + " reproduces by laying eggs";
    }
}