import java.util.*;

class Person implements Observer // Person implements built-in Observer interface
{
	String personName;

	public Person(String personName)
	{
		this.personName = personName;
	}

	public String getPersonName()
	{
		return personName;
	}

	public void setPersonName(String personName)
	{
		this.personName = personName;
	}

	public void update(Observable obj, Object availabiliy)
	{
		System.out.println("Hello "+personName+", Product is now "+availabiliy+" on flipkart");
	}
}