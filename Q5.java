public class Q5 {
    public static void main(String[] args) {
        int n = 5; // hauteur du triangle
        for (int i = 5; i >= 0; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
