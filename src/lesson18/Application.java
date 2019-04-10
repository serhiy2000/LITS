package lesson18;

import java.io.FileReader;
import java.util.*;

public class Application {
    public static void main(String[] args) throws Exception {
//        FileReader textFile = new FileReader("/home/loco/IdeaProjects/LITS/src/lesson18/text.txt");
//        Scanner scanner = new Scanner(textFile);
//        String inputText = scanner.nextLine();
//        textFile.close();
        String inputText = "Lorem1111 ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\n" +
                "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.\n" +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.\n" +
                "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        System.out.println(inputText +"\nSymbols="+ inputText.length());
        String clearCommas = inputText.replaceAll("[^A-Za-z0-9]","");
        System.out.println(clearCommas+"\nSymbols="+clearCommas.length());

        Map<Character, Integer> charMap = new HashMap<>();

        char [] charsLoremIpsum = clearCommas.toCharArray();
        System.out.println("charsLoremIpsum.length = "+charsLoremIpsum.length);

        // comparator
        int max = 0;
        char maxChar='b';
        for (int i=0; i<clearCommas.length(); i++){
            char currentChar = clearCommas.charAt(i);

            if (charMap.containsKey(currentChar)){
                int quantity = charMap.get(currentChar);
                charMap.put(currentChar, quantity+1);
            } else {
                charMap.put(currentChar, 1);
            }
            if (max<charMap.get(currentChar)) {max = charMap.get(currentChar);
            maxChar = currentChar;}

        }
        System.out.println("Test from lesson:");
        System.out.println(charMap);
        System.out.println("Max frequent symbol: '"+maxChar+"'\nQuantity "+max);

        System.out.println("Home work");
//----------------------------------------------------
        System.out.println(inputText +"\nHomeSymbols="+ inputText.length());
        String inputTextHome = inputText.toLowerCase();
        String clearCommasHome = inputTextHome.replaceAll("[^aoieu]","");
        System.out.println(clearCommasHome+"\nSymbols="+clearCommasHome.length());


        Map<Character, Integer> charMapHome = new HashMap<>();

        char [] charsLoremIpsumHome = clearCommasHome.toCharArray();
        System.out.println("charsLoremIpsum.length = "+charsLoremIpsumHome.length);

        // comparator
        int maxHome = 0;
        char maxCharHome='a';
        for (int i=0; i<clearCommasHome.length(); i++){
            char currentChar = clearCommasHome.charAt(i);

            if (charMapHome.containsKey(currentChar)){
                int quantity = charMapHome.get(currentChar);
                charMapHome.remove(currentChar);
                charMapHome.put(currentChar, quantity+1);
            } else {
                charMapHome.put(currentChar, 1);
            }
            if (maxHome<charMapHome.get(currentChar)) {maxHome = charMapHome.get(currentChar);
            maxCharHome = currentChar;}

        }
        System.out.println("Max frequent symbol (home): '"+maxCharHome+"'\nQuantity "+maxHome);

    }
}