public class DiamondGenerator {
    public static String createDiamond(int size, String symbol) {
        StringBuilder diamond = new StringBuilder();

        for (int i = 1; i <= size; i++) {
            for (int j = size - 1; j >= i; j--) {
                diamond.append(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                diamond.append(symbol);
            }
            diamond.append("\n");
        }

        for (int i = size - 1; i >= 1; i--) {
            for (int j = i; j < size; j++) {
                diamond.append(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                diamond.append(symbol);
            }
            diamond.append("\n");
        }

        return diamond.toString();
    }

    public static void main(String[] args) {
        System.out.println(createDiamond(5, "#"));
    }
}
