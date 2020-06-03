package animalKingdom;

public class Mammal extends Animal 
{
    private String name;
    
    public Mammal(String name, int stomach)
    {
        this.name = name;
        this.stomach = stomach;
    }

    public Mammal(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }
}