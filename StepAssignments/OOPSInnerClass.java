package StepAssignments;

public class OOPSInnerClass {
        static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }

        public static CharacterPatternMap[] createCharacterPatternMaps() {
            return new CharacterPatternMap[] {
                new CharacterPatternMap('O', new String[] {
                    "   ***   ",
                    " **   ** ",
                    " **   ** ",
                    " **   ** ",
                    " **   ** ",
                    " **   ** ",
                    "   ***   "
                }),
                new CharacterPatternMap('P', new String[] {
                    " *****   ",
                    " **   ** ",
                    " **   ** ",
                    " *****   ",
                    " **      ",
                    " **      ",
                    " **      "
                }),
                new CharacterPatternMap('S', new String[] {
                    "   ***   ",
                    " **    **",
                    " **      ",
                    "   ***   ",
                    "      ** ",
                    " **    **",
                    "   ***   "
                })
            };
        }

        public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
            for (CharacterPatternMap map : charMaps) {
                if (map.getCharacter() == ch) {
                    return map.getPattern();
                }
            }

            // Default blank pattern (prevents crash)
            return new String[] {
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         ",
                "         "
            };
        }

        public static void printMessage(String message, CharacterPatternMap[] charMaps) {

            StringBuilder[] bannerLines = new StringBuilder[7];

            for (int i = 0; i < 7; i++) {
                bannerLines[i] = new StringBuilder();
            }

            for (char ch : message.toUpperCase().toCharArray()) {

                String[] pattern = getCharacterPattern(ch, charMaps);

                for (int i = 0; i < 7; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }

            for (StringBuilder line : bannerLines) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps =
                CharacterPatternMap.createCharacterPatternMaps();

        String message = "OOPS";
        CharacterPatternMap.printMessage(message, charMaps);
    }
}