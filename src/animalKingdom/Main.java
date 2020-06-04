package animalKingdom;

public class Main
{
    public static void main(String[] args) 
    {
        System.out.println("This is Happening");
        System.out.println("\n\n| MAMMALS | Discovered |\n");
        Mammal panda = new Mammal("Panda", 1, 1869);
        Mammal zebra = new Mammal("Zebra", 1, 1778);
        Mammal koala = new Mammal("Koala", 1, 1816);
        Mammal sloth = new Mammal("Sloth", 1, 1804);
        Mammal armadillo = new Mammal("Armadillo", 1, 1758);
        Mammal raccoon = new Mammal("Raccoon", 1, 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 1, 2021);
        System.out.println(panda.toString());
        System.out.println(zebra.toString());
        System.out.println(koala.toString());
        System.out.println(sloth.toString());
        System.out.println(armadillo.toString());
        System.out.println(raccoon.toString());
        System.out.println(bigfoot.toString());
        System.out.println("\n\n| BIRDS | Discovered |\n");
        Bird pigeon = new Bird("Pigeon", 1, 1837);
        Bird peacock = new Bird("Peacock", 1, 1821);
        Bird toucan = new Bird("Toucan", 1, 1758);
        Bird parrot = new Bird("Parrot", 1, 1824);
        Bird swan = new Bird("Swan", 1, 1758);
        System.out.println(pigeon.toString());
        System.out.println(peacock.toString());
        System.out.println(toucan.toString());
        System.out.println(parrot.toString());
        System.out.println(swan.toString());
        System.out.println("\n\n| FISH | Discovered |\n");
        Fish salmon = new Fish("Salmon", 1, 1758);
        Fish catfish = new Fish("Catfish", 1, 1817);
        Fish perch = new Fish("Perch", 1, 1758);
        System.out.println(salmon.toString());
        System.out.println(catfish.toString());
        System.out.println(perch.toString());
        System.out.println("\n*** Test Methods ***\n");
        System.out.println(panda.consumes(10, "bamboo"));
        // System.out.println(panda.getStomach());
        System.out.println(panda.moves(5));
        System.out.println(pigeon.moves(5));
        System.out.println(salmon.moves(5));
        System.out.println(panda.breathes());
        System.out.println(pigeon.breathes());
        System.out.println(salmon.breathes());
        System.out.println(panda.reproduces());
        System.out.println(pigeon.reproduces());
        System.out.println(salmon.reproduces());
        
    }
}