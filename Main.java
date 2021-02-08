import java.util.Random;

class Main 
{
  public static void main(String[] args) 
  {
      
      Random r = new Random();
      int randomNum = r.nextInt(51);
      int x;

      System.out.println("The Random Number is: " + randomNum);


      for(x = randomNum; x >= 0; x -= 1)
      {
        System.out.println(x);
      }

      if (randomNum <= 15)
      {
        System.out.println("Ahoy Mateys!");
      }

      else if (randomNum > 20 & randomNum < 42)
      {
        System.out.println("Cannonball!");
      }

      else
      {
        System.out.println("Look, a sea shanty!");
      }
    
    


  }
}   