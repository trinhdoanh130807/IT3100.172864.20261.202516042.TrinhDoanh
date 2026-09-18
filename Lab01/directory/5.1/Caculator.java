import javax.swing.JOptionPane;
public class Caculator {
    public static void main(String[] args) {
        String doublenums1 = JOptionPane.showInputDialog("Enter the first number:");
        double nums1 = Double.parseDouble(doublenums1);
        String doublenums2 = JOptionPane.showInputDialog("Enter the second number:");
        double nums2 = Double.parseDouble(doublenums2);
        double sum = nums1 + nums2;
        double diff2v1 = nums2-nums1;
        double diff1v2 = nums1-nums2;
        double product = nums1*nums2;
        System.out.println("Summary: "+sum);
        System.out.println("Difference 2v1: "+diff2v1);
        System.out.println("Difference 1v2: "+diff1v2);
        System.out.println("Product: "+product);
        if(nums1==0 && nums2!=0){
            System.out.println("Quotient 1v2: 0");
            System.out.println("Quotient 2v1: No result");
        }
        else if(nums1!=0 && nums2==0){
            System.out.println("Quotient 1v2: No result");
            System.out.println("Quotient 2v1: 0");
        }
        else if(nums1 == 0 && nums2 == 0){
            System.out.println("Quotient 1v2: No result");
            System.out.println("Quotient 2v1: No result");
        }
        else{
            double quotient1v2 = nums1/nums2;
            double quotient2v1 = nums2/nums1;
            System.out.println("Quotient 1v2: "+quotient1v2);
            System.out.println("Quotient 2v1: "+quotient2v1);
        }
        
    }
}
