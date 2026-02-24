package StepAssignments;

public class OOPSStringJoin {

    public static void main(String[] args) {
         String gap = "   ";

        
        System.out.println(String.join(gap, "   ***  " + "     ***   " + "  ****** " + "      **** "));
        System.out.println(String.join(gap, " **   ** " + "  **   **  " + " **    ** " + "  **    **"));
        System.out.println(String.join(gap, "**     **" + " **     ** " + " **     ** " + "**      "));
        System.out.println(String.join(gap, "**     **" + " **     ** " + " **** **" + "      ** "));
        System.out.println(String.join(gap, "**     **" + " **     ** " + " **      " + "       **"));
        System.out.println(String.join(gap, " **   ** " + " **    **  " + " **      " + "  **    **"));
        System.out.println(String.join(gap, "   *** " + "      ***   " + "  **      " + "    **** "));
    }
}
