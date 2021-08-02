
public class AnimalProgram
{
	// main method to execute the Animal.java 
   public static void main(String[] args)
{

 Animal animal1 = new Animal("you write the animal name like this :lion   " ,4);// using an object to the class Animal

 System.out.printf("animal name is : %s%n",animal1.getName());
 System.out.printf("animal leg is : %d%n",animal1.getNumLeg());

}

} 