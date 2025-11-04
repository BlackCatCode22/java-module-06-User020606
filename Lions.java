public class Lions extends Animal{
    private static int NumOfLions;

    public Lions(String sex, String species, String weight, int age, String animalName,
                 String ID, String birthday, String color, String locations,
                 String state, String arrivalDate) {

        super(sex, species, weight, age, animalName, ID, birthday, color, locations, state, arrivalDate);
        NumOfLions++;
    }

    public static int getNumOfLions() {
        return NumOfLions;
    }

    @Override
    public String toString() {
        return "Lions{" +
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