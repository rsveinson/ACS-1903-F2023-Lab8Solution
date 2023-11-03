/**
 * ACS-1903 Lab8 Q7
 * @author (your name and student number here)
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class SumOfOddNumbersKey{
    public static void main(String[] args){
        String line = JOptionPane.showInputDialog("Enter some numbers: ");
        Scanner s = new Scanner(line);
        int sum = 0;

        // add your code here
        while(s.hasNext()){

            int n = s.nextInt();

            sum += n % 2 != 0 ? n : 0;
        }// end while

        // alternate solution
        while(s.hasNext()){
            int n = Integer.parseInt(s.next());
            sum += n % 2 != 0 ? n : 0;
        }// end while

        JOptionPane.showMessageDialog(null, "The sum of odd numbers is " + sum);        
    }
}
