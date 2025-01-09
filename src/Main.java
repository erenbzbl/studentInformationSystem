import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer [] list;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi Boyutunu Giriniz: ");
        int n = scanner.nextInt();
        list = new Integer[n];


        for (int i = 0; i < n; i++) {
            System.out.print( i + ". Dizini Giriniz: ");
            list[i] = scanner.nextInt();
        }
        //Girilen dizi değerlerini küçükten büyüğe doğru sıralamaya yarayan "Arrays Komutu"
        Arrays.sort(list);
        //  Arrays.sort(list, Collections.reverseOrder()); Girilen dizi değerlerini büyükten küçüğe sıralar

        System.out.println("Küçükten Büyüğe Sıralanmış Dizi: "  + Arrays.toString(list));

    }
}
