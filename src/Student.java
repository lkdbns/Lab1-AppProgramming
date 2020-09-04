
public class Student 
{
	public String studentName;
	public String grade;
	public boolean vegetarian;
	
	public Student (String name, String level, boolean food) {
	
		studentName = name;
		grade = level;
		vegetarian = food;
		
	}
	
	public String toString() {
		if(vegetarian) {
			return "* " + studentName + " - " + grade + " (veg)\n";
		}
		else {
			return "* " + studentName + " - " + grade + " (non-veg)\n";
		}
	}
}
