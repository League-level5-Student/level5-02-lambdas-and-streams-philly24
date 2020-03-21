
public class Solution {
	int sumNum;
	public String multiply(String num1, String num2) {
	        int numMul = Integer.parseInt(num1);
	        int numMul2 = Integer.parseInt(num2);
	        sumNum = numMul * numMul2;
	        
	        String solution = Integer.toString(sumNum);
	       // System.out.print(sumNum);
	        System.out.print(solution);
	        
	        return solution;
	    }
	    public static void main(String[] args){
	        Solution run = new Solution();
	        run.multiply("10", "10");
	    }
}
