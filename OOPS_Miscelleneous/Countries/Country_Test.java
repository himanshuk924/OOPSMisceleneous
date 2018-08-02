package Countries;

import java.util.*;

public class Country_Test {
	//comparing country 1 and country 2 according to their density,population and area
	static void CompareCountry(Country country1, Country country2, double pop_density1, double pop_density2) {
		if ((country1.getPopulation()) > country2.getPopulation()) {
			System.out.println("Country with largest population is " + country1.getCountry_name());
		} else {
			System.out.println("Country with largest population is " + country2.getCountry_name());
		}
		if ((country1.getArea()) > country2.getArea()) {
			System.out.println("Country with bigger area is " + country1.getCountry_name());
		} else {
			System.out.println("Country with bigger area is " + country2.getCountry_name());
		}

		if (pop_density1 > pop_density2) {
			System.out.println("Country with largest population density is " + country1.getCountry_name());
		} else {
			System.out.println("Country with largest population density is " + country2.getCountry_name());
		}
	}

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		Country country1 = new Country();
		Country country2 = new Country();

		System.out.println("Enter name of the country");
		String name = get.next();
		country1.setCountry_name(name);

		System.out.println("Enter population of the country");
		Long population = get.nextLong();
		country1.setPopulation(population);

		System.out.println("Enter area of the country");
		double area = get.nextDouble();
		country1.setArea(area);

		double pop_density1 = country1.populationDensity(country1.getPopulation(), country1.getArea());

		System.out.println("Enter name of the second country");
		String name2 = get.next();
		country2.setCountry_name(name2);
		System.out.println("Enter population of the second country");
		Long population2 = get.nextLong();
		country2.setPopulation(population2);
		System.out.println("Enter area of the second country");
		double area2 = get.nextDouble();
		country2.setArea(area2);

		double pop_density2 = country2.populationDensity(country2.getPopulation(), country2.getArea());

		CompareCountry(country1, country2, pop_density1, pop_density2);

		get.close();

	}
}