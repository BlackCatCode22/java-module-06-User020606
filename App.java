import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        HashMap<String,Animal> animals = new HashMap<>();


        // Path to your text file
        String filePath = "arrivingAnimals.txt"; // <-- change to your file’s name or path

        // Use try-with-resources so the reader closes automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("Reading contents of " + filePath + "...\n");

            // Read file line by line until no more lines are left
            while ((line = reader.readLine()) != null) {
                //System.out.println(line);
                String[] elements = line.split(", ");

                 String sex;
                 String species;
                 String weight; weight = elements[3];
                 int age;
                 String animalName;
                 String ID;
                 String birthday;
                 String color; color = elements[2];
                 String locations; locations = elements[4];
                 String state; state = elements[5];
                 String arrivalDate;

                 //split element 1
                String[] elements1 = elements[0].split(" ");
                 age =  Integer.parseInt(elements1[0]);
                 sex = elements1[3];
                 species = elements1[4];

                //split element 2
                String[] elements2 = elements[1].split(" ");
                 birthday = elements2[2];




                if(species.equals("hyena")){

                    Hyenas hyenas = new Hyenas(sex,species,weight,age,"","Hy0" + Hyenas.getNumOfHyenas(),birthday
                            ,color,locations,state,"");


                    animals.put(hyenas.getID(),hyenas);

                }

                if(species.equals("lion")){

                    Lions lion = new Lions(sex,species,weight,age,"","Li0" + Lions.getNumOfLions(),birthday
                            ,color,locations,state,"");


                    animals.put(lion.getID(),lion);

                }

                if(species.equals("tiger")){

                    Tigers tiger = new Tigers(sex,species,weight,age,"","Ti0" + Tigers.getNumOfTigers(),birthday
                            ,color,locations,state,"");


                    animals.put(tiger.getID(),tiger);

                }

                if(species.equals("bear")){
                    Bears bear = new Bears(sex,species,weight,age,"","Be0" + Bears.getNumOfBears(),birthday
                            ,color,locations,state,"");
                    animals.put(bear.getID(),bear);

                }




            }
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        //Hy00-Hy03 Li00-03 Ti00-Ti03 Be00-Be03


        System.out.println("Hyenas");
        System.out.println("\n" + animals.get("Hy00"));
        System.out.println(animals.get("Hy01"));
        System.out.println(animals.get("Hy02"));
        System.out.println(animals.get("Hy03"));

        System.out.println("\nLions");
        System.out.println("\n" + animals.get("Li00"));
        System.out.println(animals.get("Li01"));
        System.out.println(animals.get("Li02"));
        System.out.println(animals.get("Li03"));

        System.out.println("\nTigers");
        System.out.println("\n" + animals.get("Ti00"));
        System.out.println(animals.get("Ti01"));
        System.out.println(animals.get("Ti02"));
        System.out.println(animals.get("Ti03"));

        System.out.println("\nBears");
        System.out.println("\n" + animals.get("Be00"));
        System.out.println(animals.get("Be01"));
        System.out.println(animals.get("Be02"));
        System.out.println(animals.get("Be03"));

    }
} 