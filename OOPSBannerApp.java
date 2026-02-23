/*
* OOPSBannerApp UCI - OOPS Banner Display Application
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
* @author Developer
* @version l.0
*/

public class OOPSBannerApp {

    public static String[] getOpattern() {
        return new String[] {
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "
        };
    }

    public static String[] getSpattern() {
        return new String[] {
                "   ***   ",
                " **   ** ",
                "**       ",
                "  *****  ",
                "      ** ",
                " **   ** ",
                "   ***   "
        };
    }

    public static String[] getPpattern() {
        return new String[] {
                "********  ",
                "**     ** ",
                "**     ** ",
                "********  ",
                "**        ",
                "**        ",
                "**        ",
        };
    }

    public static void main(String[] args) {
        String[] oPattern = getOpattern();
        String[] sPattern = getSpattern();
        String[] pPattern = getPpattern();

        for (int i=0;i< oPattern.length;i++){
            System.out.println(oPattern[i] + " "+ oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }

    }
}