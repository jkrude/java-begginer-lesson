package lesson6.solution;

public class Tree {
    public static void main(String[] args) {
        int height = 9;
        printTree(height);
    }

    private static void printTree(int height) {
        int stem = height / 3;
        for (int i = 1; i <= height; i++) {
            for (int whiteSpace = height - 1; whiteSpace != i - 1; whiteSpace--) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= i * 2 - 1; stars++) {
                double random = Math.random();
                if (random > 0.2) {
                    System.out.print("*");
                } else if (random < 0.15) {
                    System.out.print("o");
                } else {
                    System.out.print("♦");
                }
            }
            System.out.print("\n");
        }
        for (int z = 0; z <= stem - 1; z++) {
            for (int j = 1; j < height - (stem / 2); j++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= stem; i++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}
