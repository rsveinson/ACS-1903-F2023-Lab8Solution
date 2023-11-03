import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
/**
 * ACS-1903 Lab8 Q7
 * @author (your name and student number here)
 */
public class TokenCountKey{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner f = new Scanner(new File("lab8.txt"));
        int count=0, countS=0;
        String token;

        // add your code here
        // while(f.hasNext()){
            // token = f.next();
            // count++;
            
            // /* could use toUpperCase/LowerCase form the STring
             // * class, or != 's' || != 'S' in the logical expression
             // */
            // if(Character.toUpperCase(token.charAt(0)) == 'S'){
                // countS++;
            // }
        // }
        

        System.out.println("Number of tokens: " + count);
        System.out.println("Number of tokens starting with s or S: " + countS);

    }
}
