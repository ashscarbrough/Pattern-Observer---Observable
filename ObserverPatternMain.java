

public class ObserverPatternMain
{
    public static void main(String[] args)
    {
        Person arpitPerson=new Person("Arpit");
        Person johnPerson=new Person("John");
        
        Product samsungMobile=new Product("Samsung", "Mobile", "Not Available");
        
        //When you opt for option "Notify me when product is available".Below registerObserver method
        //get executed        
        samsungMobile.registerObserver(arpitPerson);
        samsungMobile.registerObserver(johnPerson);
        
        //Now product is available
        System.out.println("Test 1:");
        samsungMobile.setAvailability("Available");
        
      //Now product is still available
        System.out.println("\nTest 2:");
        samsungMobile.setAvailability("Available");

        //Now product is unavailable
        System.out.println("\nTest 3:");
        samsungMobile.removeObserver(johnPerson);
        samsungMobile.setAvailability("Not Available");
   }
}