package animalKingdom;

public class Main
{
    public static void main(String[] args) 
    {
        System.out.println("This is Happening");
        System.out.println("\n\n*** MAMMALS ***");
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
        System.out.println("\n*** BIRDS ***\n");
        Bird pigeon = new Bird("Pigeon", 1, 1869);
        Bird peacock = new Bird("Peacock", 1, 1778);
        Bird toucan = new Bird("Toucan", 1, 1816);
        Bird parrot = new Bird("Parrot", 1, 1804);
        Bird swan = new Bird("Swan", 1, 1758);
        System.out.println(pigeon.toString());
        System.out.println(peacock.toString());
        System.out.println(toucan.toString());
        System.out.println(parrot.toString());
        System.out.println(swan.toString());

    }
}