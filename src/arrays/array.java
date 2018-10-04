package arrays;

public class array {


    public static void main(String[] args) {


        //double marks[] = new double[5];

        // 0,1,2,3,4

        //marks[0] = 85;

        int marks[] = {72,85,93,29,85};

        // Gennemløb af array med for loop
        for(int counter = 0; counter < marks.length; counter++){
            System.out.println("Nummer " + counter + " er " + marks[counter]);
        }

        // Gennemløb af array uden for loop
        for (int nummer : marks) {
            System.out.println("Foreach :" + nummer);
        }

    }
}
