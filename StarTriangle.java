public class StarTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {        // 5 rows
            for (int j = 8; j > i; j--) {    // stars decrease each row
                System.out.print("p ");
            }
             for (int k = 1; k <= i; k++) {          // then print stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
