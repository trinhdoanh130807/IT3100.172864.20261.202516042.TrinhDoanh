import javax.swing.JOptionPane;
public class Seconddegreeonevariable {
    public static void main(String[] args) {
        String doublea = JOptionPane.showInputDialog("Input a: ");
        double a = Double.parseDouble(doublea);
        
        String doubleb = JOptionPane.showInputDialog("Input b: ");
        double b = Double.parseDouble(doubleb);
        
        String doublec = JOptionPane.showInputDialog("Input c: ");
        double c = Double.parseDouble(doublec);
        
        if(a==0&&b==0&&c==0){
            System.out.println("Infinite solutions");
        }
        else if(a==0&&b==0&&c!=0){
            System.out.println("No solution");
        }
        else if(a==0&&b!=0){
            double x=-c/b;
            System.out.println("1 root x = "+x);
        }
        else{
            double d = b*b-4*a*c; //d=delta
            if(d<0){
                System.out.println("No solution");
            }
            else if(d==0){
                double x=-b/2/a;
                System.out.println("Double root x = "+x);
            }
            else{
                double x1=(-b-Math.sqrt(d))/2/a;
                double x2=(-b+Math.sqrt(d))/2/a;
                System.out.println("Root x1 = "+x1);
                System.out.println("Root x2 = "+x2);

            }

        }
    }
}
