import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 6, 8, 4, 2, 8, 10, 10, 6, 2, 0, 0}; // Örnek dizi
        ArrayList<Integer> repeatedEvens = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            // Çift sayıları kontrol et
            if (numbers[i] % 2 == 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    // Aynı çift sayı tekrar ediyor mu?
                    if (numbers[i] == numbers[j] && !repeatedEvens.contains(numbers[i])) {
                        repeatedEvens.add(numbers[i]);
                        break;
                    }
                }
            }
        }

        // Sonuçları yazdır
        System.out.println("Tekrar eden çift sayılar: " + repeatedEvens);
    }
}
