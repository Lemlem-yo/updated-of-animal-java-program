public class Animal
{
	// creating instance variable 
  private String name ;
  private int numLeg ;
 //  defining constractor 
public Animal(String name,int numLeg)
{
 this.name = name; 
 this.numLeg = numLeg; // to defining number of leg 
}
// setmethod to accept the parameter for name
 public void setName(String name) 
{
 this.name = name;
}
// setmethod to accept the number of leg 
 public void setNumLeg(int numLeg) 
{
 this.numLeg = numLeg;
}
//  getmethod to return the value that enter
public String getName()
{
 return name ; 
}
public int getNumLeg()
{
 return numLeg ; 
}
}