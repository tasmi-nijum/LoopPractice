
/**
 * Write a description of class LoopPractice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class LoopPractice
{
  public void countdown()
{
    int count = 5;

    while (count > 0)
    {
        System.out.println(count);
        count--;
    }

    System.out.println("Go!");
}

    public void multiplicationTable(int number)
{
    for (int i = 1; i <= 10; i++)
    {
        System.out.println(number + " x " + i + " = " + (number * i));
    }
}

   public void printPlaylist()
{
    ArrayList<String> playlist = new ArrayList<>();

    playlist.add("Winter Walk");
    playlist.add("Snowfall");
    playlist.add("December Lights");
    playlist.add("Morning Light");

    
    for (String song : playlist)
    {
        System.out.println("Now playing: " + song);
    }

    System.out.println("Number of tracks: " + playlist.size());
}

   public void printChristmasTree(int height)
{
    for (int row = 1; row <= height; row++)
    {
        for (int space = 1; space <= height - row; space++)
        {
            System.out.print(" ");
        }

        for (int star = 1; star <= 2 * row - 1; star++)
        {
            System.out.print("*");
        }

        System.out.println();
    }

    for (int space = 1; space < height; space++)
    {
        System.out.print(" ");
    }

    System.out.println("|");
}
}