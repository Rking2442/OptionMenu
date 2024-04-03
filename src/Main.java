import javax.swing.*;
import java.lang.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
        String name = JOptionPane.showInputDialog("Hello");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
        JOptionPane.showMessageDialog(null, "You Are: " + age);
             double height = Double.parseDouble(JOptionPane.showInputDialog("Height (Inches) : "));
             int height1 = (int)height % 12;
             int height2 = (int)height / 12;

            JOptionPane.showMessageDialog(null, "You Are: " + height2 + ". " + height1);
        } catch (Exception e) {
            System.out.println("Not A Number Or " + e);
            }




    }
}