package sam;
import org.junit.Test;
public interface Toy {
	void setPrice(double price);

	void setColor(String color);
}

public interface Movable {
	void move();
}

public interface Flyable {
	void fly();
}

public class week12_ToyHouse implements Toy {
	double price;
	String color;

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "ToyHouse: Price:" + price + "Color: " + color;
	}
}

public class ToyCar implements Toy, Movable {
	double price;
	String color;

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("ToyCar: Start moving car.");
	}

	@Override
	public String toString() {
		return "ToyCar: - Price: " + price + " Color: " + color;
	}
}

public class ToyPlane implements Toy, Movable, Flyable {
	double price;
	String color;

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void move() {
		System.out.println("ToyPlane: Start moving plane.");
	}

	@Override
	public void fly() {
		System.out.println("ToyPlane: Start flying plane.");
	}

	@Override
	public String toString() {
		return "ToyPlane: - Price: " + price + " Color: " + color;
	}
}

public class ToyBuilder {
	public static ToyHousebuild ToyHouse() {
		week12_ToyHouse toyHouse = new week12_ToyHouse();
		toyHouse.setPrice(15.00);
		toyHouse.setColor("green");
		return toyHouse;
	}

public static ToyCarbuildToyCar(){ 
ToyCar toyCar=new ToyCar(); 
toyCar.setPrice(25.00); 
toyCar.setColor("red"); 
toyCar.move(); 
return toyCar; 
 }

	

public static ToyPlanebuildToyPlane(){ 
ToyPlane toyPlane=new ToyPlane(); 
toyPlane.setPrice(125.00); 
toyPlane.setColor("white"); 
toyPlane.move(); 
toyPlane.fly(); 
return toyPlane; 
 }
}


public class ToyBuilderTest {
	@Test
	public void testBuildToyHouse() throws Exception {
		ToyHousetoy House = ToyBuilder.buildToyHouse();
		System.out.println(toyHouse);
	}

	@Test
	public void testBuildToyCar() throws Exception {
		ToyCartoy Car = ToyBuilder.buildToyCar();
		;
		System.out.println(toyCar);
	}

	@Test
	public void testBuildToyPlane() throws Exception {
		ToyPlanetoy Plane = ToyBuilder.buildToyPlane();
		System.out.println(toyPlane);
	}
}
//Still need to check this