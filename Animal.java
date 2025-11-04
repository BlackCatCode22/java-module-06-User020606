public class Animal {

    // Keeps Track Of Number Of Animals
    private static int NumOfAnimals;

    private String sex;
    private String species;
    private String weight;
    private int age;
    private String animalName;
    private String ID;
    private String birthday;
    private String color;
    private String locations;
    private String state;
    private String arrivalDate;

    // --- Constructors ---
    public Animal(String sex, String species, String weight, int age, String animalName,
                  String ID, String birthday, String color, String locations, String state, String arrivalDate    ) {

        this.sex = sex;
        this.species = species;
        this.weight = weight;
        this.age = age;
        this.animalName = animalName;
        this.ID = ID;
        this.birthday = birthday;
        this.color = color;
        this.locations = locations;
        this.state = state;
        this.arrivalDate = arrivalDate;

        // Increment static counter each time a new Animal is created
        NumOfAnimals++;
    }

    // Optional default constructor
    public Animal(String sex, String species, String weight, String animalName, String ID, String birthday, String color, String locations) {
        NumOfAnimals++;
    }

    // --- Getters and Setters ---

    public static int getNumOfAnimals() {
        return NumOfAnimals;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    // --- Optional: for easy printing ---
    @Override
    public String toString() {
        return "Animal{" +
                "sex='" + sex + '\'' +
                ", species='" + species + '\'' +
                ", weight='" + weight + '\'' +
                ", age=" + age +
                ", animalName='" + animalName + '\'' +
                ", ID='" + ID + '\'' +
                ", birthday='" + birthday + '\'' +
                ", color='" + color + '\'' +
                ", locations='" + locations + '\'' +
                ", state='" + state + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                '}';
    }
}

