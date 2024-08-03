import java.util.Scanner;
import java.util.ArrayList;

class gradeCompute{
	    ArrayList<Double> arr = new ArrayList<>();
		double sum = 0;
		double high;
		double low;
		
	void enterInput(){
		System.out.println("Enter the students' overall grades (in %) one by one [enter '-1' to indicate the completion of entering grades] :\n");
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		double db = sc.nextDouble();
		arr.add(db);
		high = arr.get(0);
		low = arr.get(0);
		i++;
		
		while(i > 0){
			db = sc.nextDouble();
			if(db == -1){
				break;
			}
			arr.add(db);
			i++;
		}
	}
		
	void print(){
		System.out.println("\nThe list of Students' grades are :");
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}
	
	double calculateAvg(){
		for(int i = 0; i < arr.size(); i++){
			sum += arr.get(i);
		}
		double avg = sum / arr.size();
		return avg;
	}
	
	double findHighScore(){
		for(int i = 0; i < arr.size(); i++){
			if(high < arr.get(i)){
				high = arr.get(i);
			}
		}
		return high;
	}
	
	double findLowScore(){
		for(int i = 0; i < arr.size(); i++){
			if(low > arr.get(i)){
				low = arr.get(i);
			}
		}
		return low;
	}
	
	void getAnalysisOfGrades(){
		
		System.out.println("\nANALYSIS OF ABOVE STUDENTS' GRADES IS AS BELOW :");
		System.out.println("-----------------------------------------------");
		System.out.printf("Average Grade is %.2f\n", calculateAvg());
		System.out.printf("Highest Grade is %.2f\n", findHighScore());
		System.out.printf("Lowest Grade is %.2f\n", findLowScore());
		System.out.println("-----------------------------------------------");
	}
}	
		
class Student_Grade_Tracker{
	public static void main(String args[]){
		
		gradeCompute obj = new gradeCompute();
		obj.enterInput();
		obj.print();
		obj.getAnalysisOfGrades();
	}
}