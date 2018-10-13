public class Project {
	private String name;
	private String desc;
	// option challenge
	private double initialCost = 0;

	// if both not provide
	public Project(){
		this.name = "no name";
		this.desc = "no description";
	}
	// only name provided
	public Project(String addName){
		this.name = addName;
		this.desc = "no description";
	}
	// if provide both
	public Project(String addName, String addDesc){
		this.name = addName;
		this.desc = addDesc;
	}
	// getter of name
	public String getName() {
		return this.name;
	}
	// setter
	public void setName(String addName){
		this.name = addName;
	}
	// getter of desc
	public String getDesc() {
		return this.desc;
	}
	// setter
	public void setDesc(String addDesc){
		this.desc = addDesc;
	}

	// option challenge
	public Project(String addName, String addDesc, double cost){
		this.name = addName;
		this.desc = addDesc;
		this.initialCost = cost;
	}
	// getter and setter
	public double getCost(){
		return this.initialCost;
	}
	public void setCost(double cost){
		this.initialCost = cost;
	}

	// elevator pitch
	// An elevator pitch is a brief, prepared statement that defines a product, service or outlines
	public String elevatorPitch(){
		// return "This is the project: '" + this.name + "' with description: '" + this.desc + "' initial cost: '" + this.initialCost + "'";
		return this.name + " (" + this.initialCost + "): " + this.desc;
	}
	// option havent done yet

	// Create a Portfolio class that will keep an ArrayList of Projects in the field projects. Use generics to ensure these are Project objects.

	// Add the getPortfolioCost method that calculates and returns the cost to buy the entire portfolio.

	// Add the showPortfolio method that will print all the project elevator pitches, followed by the total cost.
}