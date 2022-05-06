import java.util.ArrayList;

public class Portfolio {
	private ArrayList<Project> projects;

	public Portfolio() {
		super();
	}

	public Portfolio(ArrayList<Project> projects) {
		super();
		this.projects = projects;
	}

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Portfolio [Projects()=" + getProjects() + "]";
	}

	public double getPortfolioCost() {
		double total = 0;
		for (Project p : projects) {
			total += p.getInitialCost();
		}
		return total;
	}

	public void showPortfolio(int numPortfolio) {

		System.out.println("\n--------- Portfolio " + numPortfolio + "---------");

		for (Project p : projects) {
			System.out.println(p.elevatorPitch());
		}

		System.out.println("Costo Total: " + getPortfolioCost());
	}

}
