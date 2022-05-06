public class Project {
	private String nombre;
	private String descripcion;
	private double initialCost;

	public Project() {
		super();
	}

	public Project(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Project(String nombre, String descripcion, double initialCost) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.initialCost = initialCost;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}

	@Override
	public String toString() {
		return "Project [Nombre()=" + getNombre() + ", Descripcion()=" + getDescripcion() + ", InitialCost()="
				+ getInitialCost() + "]";
	}

	public String elevatorPitch() {
		return getNombre() + " (" + getInitialCost() + "): " + getDescripcion();
	}

}
