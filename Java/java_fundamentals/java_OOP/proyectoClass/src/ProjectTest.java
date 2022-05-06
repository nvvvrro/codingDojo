import java.util.ArrayList;

public class ProjectTest {
	public static void main(String[] args) {
		
		Project p1 = new Project("class1", "Descripcion de Clase 1", 23.4);
		Project p2 = new Project("class2", "Descripcion de Clase 2", 43.4);
		Project p3 = new Project("class3", "Descripcion de Clase 3", 22.0);

		ArrayList<Project> projects1 = new ArrayList<Project>();

		projects1.add(p1);
		projects1.add(p2);

		ArrayList<Project> projects2 = new ArrayList<Project>();
		projects2.add(p3);

		Portfolio portfolio1 = new Portfolio(projects1);
		Portfolio portfolio2 = new Portfolio(projects2);

		portfolio1.showPortfolio(1);
		portfolio2.showPortfolio(2);

	}
}
