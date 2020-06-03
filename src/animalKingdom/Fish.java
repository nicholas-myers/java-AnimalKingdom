package animalKingdom;

public class Fish extends Animal {
    private String name;
    
    public Fish(String name, int stomach)
    {
        this.name = name;
        this.stomach = stomach;
    }

    public Fish(String name)
    {
        this.name = name;
    }
    @Override
    public String getName()
    {
        return name;
    }
}