import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int b = scanner.nextInt();
//
//        System.out.println("%c");
//        String a = scanner.next();
//        String mas[] = new String[b];
//
//        for(int i = 0 ; i<10; i++ ){
//            mas.toString();
//
//        }
//        System.out.println(mas);
//        }
//
//}

public class Main {
    public static void main(String[] args) {
//        int rows = 3;
//        int cols = 4;
//        int[][] matrix = new int[rows][cols];
//
        Random random = new Random();
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                matrix[i][j] = random.nextInt(10); // generates a random integer between 0 and 9
//            }
//        }
//
//        // print the matrix
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

//        String str = "mukhit";
//        String[] parts = str.split("");

//        for (int i = 0 ; i<str.length(); i++) {
////            part[i] = parts[i];
//            System.out.println(parts[i]);
//        }
        int count = 0;
        String str = "";
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();

        String[] part = str.split("");
        int c = 0, o = 0;
        int mas[] = new int[b];
        int max = 0;
        for(int i = 0;i<b;i++){
            mas[i] = 0;

            if(Math.pow(i,2)<b){
                mas[i] = i;
                c = i;
            }else{
                break;
            }
        }

        for(int d = c;d>0;d--){
            System.out.println(mas[d]);
            break;
        }


    }
}



