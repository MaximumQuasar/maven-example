class FactoryProducer{
	public static AbstractFactory getFactory(String opt){
		if(opt.equalsIgnoreCase("Shape"))
			return new ShapeFactory();
		if(opt.equalsIgnoreCase("Color"))
			return new ColorFactory();
		return null;
	}

}