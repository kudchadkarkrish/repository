package StepAssignments;

public class OOPSArrayInitialisation {
    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            System.out.println(
                getOPattern(i) + "  " +
                getOPattern(i) + "  " +
                getPPattern(i) + "  " +
                getSPattern(i)
            );
        }
    }

    private static String getOPattern(int line) {
        String[] o = {
            "  **  ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            "  **  "
        };
        return o[line];
    }

    private static String getPPattern(int line) {
        String[] p = {
            " ****  ",
            " *   * ",
            " *   * ",
            " ****  ",
            " *     ",
            " *     ",
            " *     "
        };
        return p[line];
    }

    private static String getSPattern(int line) {
        String[] s = {
            "  **** ",
            " *     ",
            " *     ",
            "  ***  ",
            "     * ",
            "     * ",
            " ****  "
        };
        return s[line];
    }
}