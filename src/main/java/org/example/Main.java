package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // JSON faylni o'qish va ro'yxatga aylantirish
            List<Money> list = objectMapper.readValue(new File("Basa/database.json"), new TypeReference<>() {
            });

            // Barcha user ma'lumotlarini chiqarish
            int i = 1;

            Scanner scanner = new Scanner(System.in);

            for (Money money : list) {
                if (i > 0 && i < 10) {
                    System.out.println(" 0" + i + ". " + money.getCode() + " - " + money.getTitle() + ". ");
                } else {
                    System.out.println(" " + i + ". " + money.getCode() + " - " + money.getTitle() + ". ");
                }
                i++;
            }

            i = 1;

            System.out.println(" O'zingizga kerak kodni tanlang. ");
            System.out.print(" >> ");
            int n = scanner.nextInt();

            for (Money money : list) {
                if (i == n) {
                    Information.code1 = money.getCode();
                    Information.cb_price1 = money.getCb_price();
                }
                i++;
            }

            i = 1;

            for (Money money : list) {
                if (i > 0 && i < 10) {
                    System.out.println(" 0" + i + ". " + money.getCode() + " - " + money.getTitle() + ". ");
                } else {
                    System.out.println(" " + i + ". " + money.getCode() + " - " + money.getTitle() + ". ");
                }
                i++;
            }

            i = 1;

            System.out.println(" O'zingizga kerak kodni tanlang. ");
            System.out.print(" >> ");
            n = scanner.nextInt();

            for (Money money : list) {
                if (i == n) {
                    Information.code2 = money.getCode();
                    Information.cb_price2 = money.getCb_price();
                }
                i++;
            }

            System.out.println();
            System.out.println(" code1...................: " + Information.code1);
            System.out.println(" cb_price1...............: " + Information.cb_price1);
            System.out.println();
            System.out.println(" code2...................: " + Information.code2);
            System.out.println(" cb_price2...............: " + Information.cb_price2);


            System.out.println("\n\n Balansingizda necha " + Information.code1 + " bor? ");
            System.out.print(" >>> ");
            double money1 = scanner.nextDouble();

            Information.result = (money1 * Double.parseDouble(Information.cb_price1)) / Double.parseDouble(Information.cb_price2);

            System.out.println("\n Sizning pulingiz quydagicha " + Information.code2 + " mablag'ga teng. ");
            System.out.print(" >>> " + Information.result + " " + Information.code2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}