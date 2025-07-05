
package ray.ugandalibrary;

import java.util.Scanner;

public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the book description:");
        String description = scanner.nextLine();

        int count = countWordOccurrences(description, "Uganda");
        
     
        System.out.println("The word 'Uganda' appears " + count + " time(s) in the description.");
        
        scanner.close();
    }
    
    public static int countWordOccurrences(String text, String targetWord) {
        if (text == null || text.isEmpty() || targetWord == null || targetWord.isEmpty()) {
            return 0;
        }
        
      
        String lowerText = text.toLowerCase();
        String lowerTarget = targetWord.toLowerCase();
        
        int count = 0;
        int index = 0;
        
        while ((index = lowerText.indexOf(lowerTarget, index)) != -1) {
            count++;
            index += targetWord.length(); 
        }
        
        return count;
    }
}
