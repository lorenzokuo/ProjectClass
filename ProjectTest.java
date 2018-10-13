public class ProjectTest {
	public static void main(String[] args) {

		Project p1 = new Project();
		Project p2 = new Project("name");
		Project p3 = new Project("Plan A","this is very secret!");
		Project p4 = new Project("Mission Impossible", "You say so", 100);

		System.out.println(p1.getName());
		System.out.println(p2.elevatorPitch());
		System.out.println(p3.elevatorPitch());
		System.out.println(p4.elevatorPitch());
	}
}