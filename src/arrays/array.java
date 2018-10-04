package arrays;

public class array {


    public static void main(String[] args) {


        //double marks[] = new double[5];

        // 0,1,2,3,4

        //marks[0] = 85;

        int marks[] = {72,85,93,29,85};

        int sum = 0;
        for(int counter = 0; counter < marks.length; counter++){
            System.out.println(marks[counter]);
            sum = sum + marks[counter];


        }

        System.out.println("sum of all 5 marks " + sum);


    }
}