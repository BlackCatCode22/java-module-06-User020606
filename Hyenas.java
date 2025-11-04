public class Hyenas extends Animal{
private static int NumOfHyenas;

public Hyenas(String sex, String species, String weight, int age, String animalName,
             String ID, String birthday, String color, String locations,
             String state, String arrivalDate) {

    super(sex, species, weight, age, animalName, ID, birthday, color, locations, state, arrivalDate);
    NumOfHyenas++;
}

public static int getNumOfHyenas() {
    return NumOfHyenas;
}

@Override
public String toString() {
    return "Hyena{" +
            "sex='" + getSex() + '\'' +
            ", species='" + getSpecies() + '\'' +
            ", weight='" + getWeight() + '\'' +
            ", age=" + getAge() +
            ", animalName='" + getAnimalName() + '\'' +
            ", ID='" + getID() + '\'' +
            ", birthday='" + getBirthday() + '\'' +
            ", color='" + getColor() + '\'' +
            ", locations='" + getLocations() + '\'' +
            ", state='" + getState() + '\'' +
            ", arrivalDate='" + getArrivalDate() + '\'' +
            '}';
    }
} 