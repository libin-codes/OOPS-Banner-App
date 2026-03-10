/*
* OOPSBannerApp UCI - OOPS Banner Display Application
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
* @author Developer
* @version l.0
 */

public class OOPSBannerApp {

    // Class to store character and its ASCII pattern
    static class CharacterPatternMap {

        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            "   ***   ",
            " **   ** ",
            "**     **",
            "**     **",
            "**     **",
            " **   ** ",
            "   ***   "
        };

        String[] P = {
            "********  ",
            "**     ** ",
            "**     ** ",
            "********  ",
            "**        ",
            "**        ",
            "**        ",};

        String[] S = {
            "   ***   ",
            " **   ** ",
            "**       ",
            "  *****  ",
            "      ** ",
            " **   ** ",
            "   ***   "
        };

        return new CharacterPatternMap[]{
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S)
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.character == ch) {
                return map.pattern;
            }
        }
        return null;
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = charMaps[0].pattern.length;

        for (int row = 0; row < height; row++) {
            for (int i = 0; i < message.length(); i++) {
                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);

                if (pattern != null) {
                    System.out.print(pattern[row] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}
