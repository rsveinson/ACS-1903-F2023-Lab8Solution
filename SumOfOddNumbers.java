/**
 * ACS-1903 Lab8 Q7
 * @author (your name and student number here)
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class SumOfOddNumbers{
    public static void main(String[] args){
        String line = JOptionPane.showInputDialog("Enter some numbers: ");
        Scanner s = new Scanner(line);
        int sum = 0;
        
        // add your code here
        
        JOptionPane.showMessageDialog(null, "The sum of odd numbers is " + sum);        
    }
}
