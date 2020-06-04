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
    @Override
    public String breathes()
    {
        return name + " dissolves oxygen through gills";
    }
    @Override
    public String reproduces()
    {
        return name + " reproduces by laying eggs";
    }
}