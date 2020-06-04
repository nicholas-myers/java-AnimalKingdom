package animalKingdom;

import java.util.*;

public class Main
{
    private static List<Animal> descendingYears = new ArrayList<>();
    private static void sortDiscovered(List<Animal> animals, SortYears checkYears, boolean printYears)
    {
        for ()
        {
            if()
        }
    }
    public static void main(String[] args) 
    {
        System.out.println("This is Happening");
        Mammal panda = new Mammal("Panda", 1, 1869);
        Mammal zebra = new Mammal("Zebra", 1, 1778);
        Mammal koala = new Mammal("Koala", 1, 1816);
        Mammal sloth = new Mammal("Sloth", 1, 1804);
        Mammal armadillo = new Mammal("Armadillo", 1, 1758);
        Mammal raccoon = new Mammal("Raccoon", 1, 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 1, 2021);
        Bird pigeon = new Bird("Pigeon", 1, 1837);
        Bird peacock = new Bird("Peacock", 1, 1821);
        Bird toucan = new Bird("Toucan", 1, 1758);
        Bird parrot = new Bird("Parrot", 1, 1824);
        Bird swan = new Bird("Swan", 1, 1758);
        Fish salmon = new Fish("Salmon", 1, 1758);
        Fish catfish = new Fish("Catfish", 1, 1817);
        Fish perch = new Fish("Perch", 1, 1758);

        List<Animal> animals = new ArrayList<>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        System.out.println("\n| Name | Discovered |");
        for(Animal a : animals)
        {
            System.out.println(a.toString());
            // System.out.println(a.moves(5));
            // System.out.println(a.breathes());
            // System.out.println(a.reproduces());
        }
        System.out.println();
        System.out.println("*** Descending Year ***");
        Arrays.sort(Comparator.comparing(o -> o.getDiscovered()));
        animals.forEach(a -> System.out.println(a));
        System.out.println();
        System.out.println("*** Alphabetical ***");
        animals.sort((a1, a2) ->a1.getName().compareToIgnoreCase(a2.getName()));
        animals.forEach(a -> System.out.println(a));
    }
}