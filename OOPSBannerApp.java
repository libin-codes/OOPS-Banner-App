/*
* OOPSBannerApp UCI - OOPS Banner Display Application
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
* @author Developer
* @version l.0
*/

public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] lines;
        lines = new String[7];
        lines[0] = String.join(" ","   ***   ", "   ***   ", "********  ", "   ***   ");
        lines[1] = String.join(" "," **   ** ", " **   ** ", "**     ** ", " **   ** ");
        lines[2] = String.join(" ","**     **", "**     **", "**     ** ", "**       ");
        lines[3] = String.join(" ","**     **", "**     **", "********  ", "  *****  ");
        lines[4] = String.join(" ","**     **", "**     **", "**        ", "      ** ");
        lines[5] = String.join(" "," **   ** ", " **   ** ", "**        ", " **   ** ");
        lines[6] = String.join(" ","   ***   ", "   ***   ", "**        ", "   ***   "); 
        
        for (String line: lines){
            System.out.println(line);
        }
    }
}