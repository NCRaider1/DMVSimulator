import java.util.Random;

public class DMVSimulator
{
    public static void main(String[] args)
    {
    Random r = new Random();
    int order = r.nextInt(100)+1;
    
    System.out.println("Welcome to the DMV. Please take a number");
    System.out.println("Your number is " + order + ". Please wait until that number is called");

    int currentSpot = order+1;
    boolean called = false;

    while(called)
    {
        System.out.println("Now calling " + currentSpot + ". Please be patient.");
        if (currentSpot == order)
        {
            called = true;
        }

        if (called && currentSpot == order)
        {
            int rando = r.nextInt(100);
            if (rando == 0){
                System.out.println("Now calling " + order + " please come to the desk.");
            }
            else
            {
                System.out.println("Oh i'm sorry, you do not have the paperwork required.");
            }
           
            break;
        }

        currentSpot = (currentSpot % 100)+1;
    }

    
    }
}

