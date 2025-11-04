public class Tigers extends Animal{
    private static int NumOfTigers;

    public Tigers(String sex, String species, String weight, int age, String animalName,
                 String ID, String birthday, String color, String locations,
                 String state, String arrivalDate) {

        super(sex, species, weight, age, animalName, ID, birthday, color, locations, state, arrivalDate);
        NumOfTigers++;
    }

    public static int getNumOfTigers() {
        return NumOfTigers;
    }

    @Override
    public String toString() {
        return "Tigers{" +
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