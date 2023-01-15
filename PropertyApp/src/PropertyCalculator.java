import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PropertyCalculator {
	List<Property> properties;
	
	public PropertyCalculator() {
		this.properties = new ArrayList<Property>();
	}
	
	public PropertyCalculator(List<Property> properties) {
		this.properties =  properties;
	}
	
	
	public double calculateSumOfPrice(){
		return this.properties.stream().map(s -> s.getPrice()).reduce(0.0, Double::sum);
	}
	
	public double calculateSumOfPrice(PropertyType propertyType){
		Double sum = this.properties.stream()
				.filter(p -> p.getClass().getName().toString().compareTo(propertyType.name()) == 0 )
				.map(s -> s.getPrice()).reduce(0.0, Double::sum);
		return sum;
	}
	
	public double calculateSumOfArea(){
		return this.properties.stream().map(s -> s.getArea()).reduce(0.0, Double::sum) / this.properties.size();
	}
	
	public double calculateSumOfArea(PropertyType propertyType){
		Double avarage = this.properties.stream()
				.filter(p -> p.getClass().getName().toString().compareTo(propertyType.name()) == 0)
				.collect(Collectors.averagingDouble(a -> a.getArea()));
		return avarage;
	}
	
	public List<Property> getPropertiesByNumberOfRoomAndNumberOfLounge(int numberOfRoom, int numberOfLounge){
		List<Property> filteredList = this.properties.stream()
				.filter(p -> p.getNumberOfRoom() == numberOfRoom && p.getNumberOfLounge() == numberOfLounge)
				.collect(Collectors.toList());
		return filteredList;
	}

}
