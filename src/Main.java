import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

//Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
public class Main {
    public static void main(String[] args) {
            Random rand = new Random();
            int number = rand.nextInt(100);
            //int number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen 1 ve 100 arasında bir tahmin giriniz: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Lütfen geçerli bir sayı giriniz! ");
                if (isWrong) {
                    right++;
                    System.out.println("Hatalı giriş yaptınız kalan hakkınız: " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Her 2 hatalı girişte hakkınızdan bir düşer");
                }
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler Tahminini doğru! Tahmin ettiğin sayı: " + number);
                isWin = true;
                break;
            } else {

                if (selected > number) {
                    System.out.println(selected + " Sayısı, gizli sayıdan büyüktür");
                } else {
                    System.out.println(selected + " Sayısı, gizli Sayıdan küçüktür");
                }
                wrong[right++] = selected;
                System.out.println("Kalan hak: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz");
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }
        }

    }
}