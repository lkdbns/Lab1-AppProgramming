
public class Zone 
{
	public String area;
	public Student[] inhabitants;
	
	public Zone (String name, int numStudents) {
	
		area = name;
		inhabitants = new Student[numStudents];
		
	}
	
	public void addStudent (Student toAdd) {
		int i = 0;
		while (inhabitants[i] != null) {
			i++;
		}
		inhabitants[i] = toAdd;
	}
	
	public String toString() {
		int i = 0;
		
		System.out.println(area + " Zone:");
		while (inhabitants[i] != null)
		{
			System.out.print(inhabitants[i]);
			i++;
		}
		return "";
		
	}
}
