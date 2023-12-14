package controlstructure_loop;

public class ControlStructure1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 78;
		
		if(number >0) {
            System.out.println("positiove number");
            
		}
		else {
			 System.out.println("negative number");
		}

		
		
		if(number >= 90) {
			System.out.println("Dis");
		}
		else if(number <90 && number >=70) {
			System.out.println("first class");
		}
		else if(number <70 && number >=50) {
			System.out.println("second class");
		}
		else {
				System.out.println("better luck for next time");
			}
		}
}
