public class Dog implements Comparable
{
    //Instance variables
    private String name;
    private int age;
    private String breed;
    private double weight;//in lbs
    private static int dogCount;//number of dogs

    //constructors
    public Dog()
    {
        name = null;
        age = 0;
        breed = null;
        weight = 0.0;
        dogCount++;
    }//end default

    public Dog(String newName, int newAge, String newBreed, double newWeight)
    {
        name = newName;
        age = newAge;
        breed = newBreed;
        weight = newWeight;
        dogCount++;
    }//end three-arg constructor

    /*public Dog(String name, int age, String breed, double weight)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.weight = weight;
        dogCount++;
    }//end multi-arg constructor*/

    //getter
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getBreed() {return breed;}
    public double getWeight() {return weight;}
    public static int getDogCount() {return dogCount;}

    //setters
    public void setName(String newName){name = newName;}
    public void setAge(int newAge){age = newAge;}
    public void setBreed(String newBreed){breed = newBreed;}
    public void setWeight(double newWeight){weight = newWeight;}

    //brain method
    public double getKgLbs()
    {
         return weight / 2.205;
     }

    //toString
    public String toString()
    {
        String output = "";
        output += "Name: " + name;
        output += "\nAge: " + age;
        output += "\nBreed: " + breed;
        output += "\nWeight: " + weight;

        return output;
    }
    public int compareTo(Object obj)
    {
        int otherAge = (((Dog) obj).getAge());
        if(age < otherAge)
        {
            return -1;
        }
        else if (age > otherAge)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}