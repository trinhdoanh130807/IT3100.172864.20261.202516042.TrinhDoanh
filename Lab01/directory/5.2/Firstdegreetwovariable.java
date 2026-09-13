import javax.swing.JOptionPane;
public class Firstdegreetwovariable {
    public static void main(String[] args) {
        String doublea11 = JOptionPane.showInputDialog("Input a11: ");
        double a11 = Double.parseDouble(doublea11);
        
        String doublea12 = JOptionPane.showInputDialog("Input a12: ");
        double a12 = Double.parseDouble(doublea12);
        
        String doubleb1 = JOptionPane.showInputDialog("Input b1: ");
        double b1 = Double.parseDouble(doubleb1);
        
        String doublea21 = JOptionPane.showInputDialog("Input a21: ");
        double a21 = Double.parseDouble(doublea21);
        
        String doublea22 = JOptionPane.showInputDialog("Input a22: ");
        double a22 = Double.parseDouble(doublea22);
        
        String doubleb2 = JOptionPane.showInputDialog("Input b2: ");
        double b2 = Double.parseDouble(doubleb2);
        if(a11*a22==a12*a21){
            if(a11*b2==a21*b1){
                System.out.println("Infinite solutions");
            }
            else{
                System.out.println("No solution");
            }
        }
        else{
            double x1 = (b1*a22-b2*a12)/(a11*a22-a12*a21);
            double x2 = (b1*a21-b2*a11)/(a12*a21-a11*a22);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
}
