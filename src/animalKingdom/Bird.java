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
}