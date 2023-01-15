import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Property> properties = new ArrayList<Property>();
		
		// Houses
		Property house1 = new House(7000.0, 97.5, 3, 1);
		properties.add(house1);
		
		Property house2 = new House(5000.81, 58.0, 2, 1);
		properties.add(house2);
		
		Property house3 = new House(10703.12, 142.0, 4, 1);
		properties.add(house3);
		
		// Villas
		Property villa1 = new Villa(42000.0, 167.5, 6, 2);
		properties.add(villa1);
		
		Property villa2 = new Villa(65500.99, 191.0, 9, 1);
		properties.add(villa2);
		
		Property villa3 = new Villa(342000.79, 467.0, 16, 5);
		properties.add(villa3);
		
		//Summer Houses
		Property summerHouse1 = new SummerHouse(142000.57, 114.5, 3, 1);
		properties.add(summerHouse1);

		Property summerHouse2 = new SummerHouse(250000.999, 280.0, 6, 2);
		properties.add(summerHouse2);
		
		Property summerHouse3 = new SummerHouse(100000.0, 150.0, 4, 2);
		properties.add(summerHouse3);
		
		PropertyCalculator pc = new PropertyCalculator(properties);
		
		System.out.println("Evlerin toplam fiyatlarını dönen metot : " + String.format("%,.2f", pc.calculateSumOfPrice(PropertyType.House)) + "\n");
		
		System.out.println("Villaların toplam fiyatlarını dönen metot : " + String.format("%,.2f", pc.calculateSumOfPrice(PropertyType.Villa)) + "\n"); 
		
		System.out.println("Yazlıkların toplam fiyatlarını dönen metot : " + String.format("%,.2f", pc.calculateSumOfPrice(PropertyType.SummerHouse)) + "\n");
		
		System.out.println("Tüm tipteki evlerin toplam fiyatlarını dönen metot : " + String.format("%,.2f", pc.calculateSumOfPrice()) + "\n");
		
		System.out.println("--------------------------------------------------------------------------------");

		System.out.println("Evlerin ortalama metrekaresini dönen metot " + String.format("%,.2f", pc.calculateSumOfArea(PropertyType.House)) + "\n");
		
		System.out.println("Villaların ortalama metrekaresini dönen metot " + String.format("%,.2f", pc.calculateSumOfArea(PropertyType.Villa)) + "\n"); 
		
		System.out.println("Yazlıkların ortalama metrekaresini dönen metot " + String.format("%,.2f", pc.calculateSumOfArea(PropertyType.SummerHouse)) + "\n");
		
		System.out.println("Tüm tipteki evlerin ortalama metrekaresini dönen metot : " + String.format("%,.2f", pc.calculateSumOfArea()) + "\n");
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println("Oda ve salon sayısına göre tüm tipteki evleri filtreleyip dönen metot : \n");
		
		List<Property> resultFilteredPropertiesByRoomAndLounge = pc.getPropertiesByNumberOfRoomAndNumberOfLounge(3, 1);
		
		resultFilteredPropertiesByRoomAndLounge.forEach(r -> r.print());
		
	}

}
