package Countries;
public class Country {
	private String country_name=getCountry_name();
	private long population;
	private double area;
	public  String getCountry_name() {
		return country_name;
	}
	public  void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public  void setArea(double area) {
		this.area = area;
	}
	//to calculate density
	public double populationDensity(long population,double area)
	{
		double pop_density=population/area;
		return pop_density;
	}
}