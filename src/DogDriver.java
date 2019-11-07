public class DogDriver
{
    public static void main(String args[])
    {
        //create a song
        Dog fang = new Dog("Fang", 5, "Husky", 80);
        Dog nutmeg = new Dog("Nutmeg", 12, "Australian Sheepdog", 45);
        Dog simon = new Dog("Simon", 1, "Husky", 50);

        System.out.println("Fang's breed and age are " + fang.getBreed() + " and " + fang.getAge() + " years.");
        System.out.println("Nutmeg's weight is " + nutmeg.getWeight() + " pounds");
        System.out.println(simon);
        System.out.println("I have " + Dog.getDogCount() + " dogs");

        if(nutmeg.compareTo(fang) < 0)
        {
            System.out.println("Nutmeg is younger than Fang");
        }
        else if(nutmeg.compareTo(fang) == 0)
        {
            System.out.println("Nutmeg and Fang are the same age");
        }
        else
        {
            System.out.println("Nutmeg is older than Fang");
        }

        if(fang.compareTo(simon) < 0)
        {
            System.out.println("Fang is younger than Simon");
        }
        else if(fang.compareTo(simon) == 0)
        {
            System.out.println("Fang and Simon are the same age");
        }
        else
        {
            System.out.println("Fang is older than Simon");
        }


    }
}
