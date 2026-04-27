public class Animal {
    public String animalName, animalSpecies;
    public boolean isAnimalExtinct;

    // constructor(parametrized)
    public Animal(String animalName, String animalSpecies, boolean isAnimalExtinct) {
        System.out.println("Animal Details: ");
        System.out.println("Animal Name: " + animalName);
        System.out.println("Animal species: " + animalSpecies);
        System.out.println("Is Animal Extinct: " + isAnimalExtinct);

        // another method to assign attributes's values
        this.animalName = animalName;
        this.animalSpecies = animalSpecies;
        this.isAnimalExtinct = isAnimalExtinct;

    }

    // copy constructor
    public Animal(Animal obj) {
        System.out.println("Copy contructor called");
        this.animalName = obj.animalName;
        this.animalSpecies = obj.animalSpecies;
        this.isAnimalExtinct = obj.isAnimalExtinct;
    }

    public void animalInfo(String animalName, String animalSpecies, boolean isAnimalExtinct) {
        String value = isAnimalExtinct ? "are extinct" : "are closer to extinction";
        System.out.println("The " + animalName + " whose species are " + animalSpecies + " " + value);
    }

}
