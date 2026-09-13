import javax.swing.JOptionPane;
public class Firstdegreevariableequaltion{
    public static void main(String[] args) {
        String doublea = JOptionPane.showInputDialog("Input a: ");
        double a = Double.parseDouble(doublea);
        String doubleb = JOptionPane.showInputDialog("Input b: ");
        double b = Double.parseDouble(doubleb);
        if(a==0&&b==0){
            System.out.println("Infinite solutions");
        }
        else if(a!=0){
            double x = -b/a;
            System.out.println("x = "+x);
        }
        else{
            System.out.println("No Solution");
        }
    }
}