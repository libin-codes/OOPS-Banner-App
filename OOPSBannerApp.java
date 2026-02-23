/*
* OOPSBannerApp UCI - OOPS Banner Display Application
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
* @author Developer
* @version l.0
*/

public class OOPSBannerApp {
    public static void main(String[] args) {

        String[] lines = {
                String.join(" ", "   ***   ", "   ***   ", "********  ", "   ***   "),
                String.join(" ", " **   ** ", " **   ** ", "**     ** ", " **   ** "),
                String.join(" ", "**     **", "**     **", "**     ** ", "**       "),
                String.join(" ", "**     **", "**     **", "********  ", "  *****  "),
                String.join(" ", "**     **", "**     **", "**        ", "      ** "),
                String.join(" ", " **   ** ", " **   ** ", "**        ", " **   ** "),
                String.join(" ", "   ***   ", "   ***   ", "**        ", "   ***   "),
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}