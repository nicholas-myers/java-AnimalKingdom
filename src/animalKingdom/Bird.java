package animalKingdom;

public class Bird extends Animal
{
    private String name;
    
    public Bird(String name, int stomach)
    {
        this.name = name;
        this.stomach = stomach;
    }

    public Bird(String name)
    {
        this.name = name;
    }
    @Override
    public String getName()
    {
        return name;
    }
}