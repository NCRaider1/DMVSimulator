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
            System.out.println("Now calling " + order + " please come to the desk.");
            break;
        }

        currentSpot = (currentSpot % 100)+1;
    }

    System.out.println("You do not have the required paperwork, GET OUT!!!");
    }
}

