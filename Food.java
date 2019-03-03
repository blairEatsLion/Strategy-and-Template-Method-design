
public class Food {
	
	private String name;
	private double carbs;
	private double fat;
	private double proteins;

    public Food(String n, double c, double f, double p) {
        name = n;
        carbs = c;
        fat = f;
        proteins = p;
    }
	
	public String getName() {
		return name;
	}
	public double getCarbs() {
		return carbs;
	}
	public double getFat() {
		return fat;
	}
	public double getProteins() {
		return proteins;
	}	
	
	
}
