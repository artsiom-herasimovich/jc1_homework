package jc1_homework.fourth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fourth {

    public void task26() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String s = in.nextLine();

        Pattern symbol = Pattern.compile("[\\p{P}\\p{S}]");
        Matcher matcherSymbol = symbol.matcher(s);
        List<String> chara = new ArrayList<>();

        while (matcherSymbol.find()) {
            chara.add(matcherSymbol.group(0));
        }
        System.out.println("Кол-во знаков препинания: " + Integer.toString(chara.size()));
    }

    public void task27() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String s = in.nextLine();
        int n = 0;

        String[] words = s.split("[\\s]");
        for (String word : words) {
            n++;
            System.out.println(word);
        }
        System.out.println(n);
    }

    public void task28() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String s = in.nextLine();
        int n = 0;

        String[] words = s.split("[\\s]");
        for (String word : words) {
            n++;
            System.out.print(word.substring(word.length() - 1));
        }
    }

    public void task29() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a text: ");
        String s = in.nextLine();

        Pattern symbol = Pattern.compile("[0x\\p{XDigit}+]");
        Matcher matcherSymbol = symbol.matcher(s);

        while (matcherSymbol.find()) {
            System.out.println(matcherSymbol.group());
        }
        System.out.println(matcherSymbol.group());

    }
}
