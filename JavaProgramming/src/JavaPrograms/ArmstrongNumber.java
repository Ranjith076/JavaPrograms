package JavaPrograms;

public class ArmstrongNumber {

	// 153 = (1*1*1) + (5*5*5) + (3*3*3) = 153
	
	public static void isArmstrong(int num) {
		
		int cube = 0;
		int rem;
		int temp;
		
		temp=num;
		
		while(num!=0) {
			
			rem=num%10;
			num=num/10;
			cube = cube+(rem*rem*rem);
		}
		
		if(temp==cube) {
			
			System.out.println("Armstrong Number");
			
		}else {
			
			System.out.println("Not an Armstrong Number");
		}
	}

	public static void main(String[] args) {
		
		isArmstrong(153);
		isArmstrong(370);
		isArmstrong(0);
		isArmstrong(1);
		isArmstrong(455);
		
	}
}
