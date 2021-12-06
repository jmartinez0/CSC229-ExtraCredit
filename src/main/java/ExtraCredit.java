//@author juan

public class ExtraCredit {

    public static float getSumOfTwoLargest(int[] a) {
        int max = Integer.MIN_VALUE;
        int lowerMax = Integer.MAX_VALUE;
        //if a[i] is greater than the greatest value, update lowerMax to hold the value of max and update max to be = a[i]
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                lowerMax = max;
                max = a[i];
            }   
            else if (a[i] > lowerMax && a[i] < max) {
                lowerMax = a[i];
            }
        }
        int sum = max + lowerMax;
        return sum;
    }
    
    public static float getSumOfTwoSmallest(int[] a) {
        int min = Integer.MAX_VALUE;
        int lowerMin = Integer.MIN_VALUE;
        //if a[i] is less than the smallest, update lowerMin to hold the value of min and update min to be = a[i]
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                lowerMin = min;
                min = a[i];
            }
            //adding the = sign to allow for duplicate numbers
            else if (a[i] <= lowerMin && a[i] >= min) {
                lowerMin = a[i];
            }
        }
        int sum = min + lowerMin;
        return sum;
    }
  
    
    
    public static void main(String[] args) {
        int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
        System.out.println("sum of two greatest: " + getSumOfTwoLargest(a));
        System.out.println("sum of two smallest: " + getSumOfTwoSmallest(a));
        float ratio = getSumOfTwoLargest(a) / getSumOfTwoSmallest(a);
        System.out.println("ratio: " + ratio);
    }
}