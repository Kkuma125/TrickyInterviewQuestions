package JavaInterviewQuesions;

public class NotANumber {

	public static void main(String[] args) {
		
		System.out.println(0.0/0.0);//NaN
		System.out.println(Float.NaN==Float.NaN);//false
		System.out.println(Float.NaN!=Float.NaN);//true
		System.out.println(Math.sqrt(-1));//NaN
		
		

	}

}
