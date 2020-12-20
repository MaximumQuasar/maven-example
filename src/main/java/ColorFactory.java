public class ColorFactory extends AbstractFactory{
	
	@Override
	public Color getColor(String color){
		if(color.equalsIgnoreCase("Red"))
			return new Red();
		if(color.equalsIgnoreCase("Green"))
			return new Green();
		if(color.equalsIgnoreCase("Blue"))
			return new Blue();
		return null;
	}

	@Override
	public Shape getShape(String shape){
		return null;
	}
}