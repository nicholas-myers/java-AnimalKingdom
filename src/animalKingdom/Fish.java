package animalKingdom;

public class Fish extends Animal 
{
    public Fish(String name, int stomach, int discovered)
    {
        super(name, stomach, discovered);
    }
    @Override
    public String moves(int moved)
    {
        return name + " swim " + moved + " leagues";
    }
}