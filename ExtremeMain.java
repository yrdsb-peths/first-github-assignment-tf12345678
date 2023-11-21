public class ExtremeMain extends ConsoleProgram
{
    public void run()
    {
        
        // Create an Extremes object
        Extremes e1 = new Extremes();
        
        // Ask the user to guess the maximum value of an Integer
        int guess1 = readInt("Guess the maximum Integer value: ");
        
        // Compute and display the difference
        // between the max and the guess
        guess1 = e1.maxDiff(guess1);
        System.out.println("You were off by " + Math.abs(guess1));
        
        // Ask the user to guess the minimum value of an Integer
        int guess2 = readInt("Guess the minimum Integer value: ");
        
        // Compute and display the difference 
        // between the min and the guess
        guess2 = e1.minDiff(guess2);
        System.out.println("You were off by " + Math.abs(guess2));
        
    }
}