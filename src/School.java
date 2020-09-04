
public class School
{
	public String schoolName;
	public Zone[] zones;
	
	public School (String name, int numZones){
	
		schoolName = name;
		zones = new Zone[numZones];
		
	}
	
	public void addZone(Zone newZone) {
		
		int i = 0;
		while (zones[i] != null) {
			i++;
		}
		zones[i] = newZone;
		
	}
	
	public String toString() {
		int i = 0;
		
		System.out.print("Welcome to " + schoolName + "!\n-------------------------\n");
		while (zones[i] != null) {
			System.out.print(zones[i]);
			i++;
		}
		return "";
		
	}
}
