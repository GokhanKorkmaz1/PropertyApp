
public abstract class Property {
	private double price;
	private double area;
	private int numberOfRoom;
	private int numberOfLounge;
	
	public Property(double price, double area, int numberOfRoom, int numberOfLounge) {
		this.price = price;
		this.area = area;
		this.numberOfRoom = numberOfRoom;
		this.numberOfLounge = numberOfLounge;
	}
	
	public void print() {
		System.out.println("Ev Tipi : " + getClass().getName() + "\nFiyat : " + price + 
				"\nBüyüklük : " + area + "\nOda Sayısı : " + numberOfRoom + "\nSalon Sayısı : " + numberOfLounge + "\n");
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getNumberOfRoom() {
		return numberOfRoom;
	}
	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}
	public int getNumberOfLounge() {
		return numberOfLounge;
	}
	public void setNumberOfLounge(int numberOfLounge) {
		this.numberOfLounge = numberOfLounge;
	}

	
}
