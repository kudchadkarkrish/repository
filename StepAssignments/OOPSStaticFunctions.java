package StepAssignments;
public class OOPSStaticFunctions {
    private static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getLine(int index) {
            return pattern[index];
        }

        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
            " ***** ",
            " *   * ",
            " *   * ",
            " ***** ",
            " *     ",
            " *     ",
            " *     "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
            "  **** ",
            " *     ",
            " *     ",
            "  ***  ",
            "     * ",
            "     * ",
            " ****  "
        });
        CharacterPattern[] word = {o, o, p, s};
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();
            for (CharacterPattern cp : word) {
                line.append(cp.getLine(i)).append("  ");
            }
            System.out.println(line);
        }
    }
}