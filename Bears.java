public class Bears extends Animal {
    private static int NumOfBears;

    public Bears(String sex, String species, String weight, int age, String animalName,
                 String ID, String birthday, String color, String locations,
                 String state, String arrivalDate) {

        super(sex, species, weight, age, animalName, ID, birthday, color, locations, state, arrivalDate);
        NumOfBears++;
    }

    public static int getNumOfBears() {
        return NumOfBears;
    }

    @Override
    public String toString() {
        return "Bears{" +
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