package vn.techmaster;

public class Draw {

    public static void drawRightTriagle(int high){
        for (int i = 0; i <= high; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void drawTriagle(int high) {
        for(int i = 1; i <= high; i++){
            for(int j = i; j < high; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*   ");
            }

            System.out.println();
        }
    }

    public static void drawSquare(int width){
        for(int i = 0; i < width; i++){
            for(int j = 0; j < width; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
