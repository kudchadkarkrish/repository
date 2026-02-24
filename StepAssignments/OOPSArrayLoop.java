package StepAssignments;

public class OOPSArrayLoop {
    public static void main(String[] args) {
        String gap = "   ";
      
        String[] bannerLines = {
            String.join(gap, "   ***  " + "     ***   " + "  ****** " + "      **** "),
            String.join(gap, " **   ** " + "  **   **  " + " **    ** " + "  **    **"),
            String.join(gap, "**     **" + " **     ** " + " **     ** " + "**      "),
            String.join(gap, "**     **" + " **     ** " + " **** **" + "      ** "),
            String.join(gap, "**     **" + " **     ** " + " **      " + "       **"),
            String.join(gap, " **   ** " + " **    **  " + " **      " + "  **    **"),
            String.join(gap, "   *** " + "      ***   " + "  **      " + "    **** "),
        };

         for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

