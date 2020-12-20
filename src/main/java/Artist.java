class Artist{
	public static void main(String arg[]){
		Shape shape=FactoryProducer.getFactory("SHAPE").getShape("Square");
		Color color=FactoryProducer.getFactory("COLOR").getColor("Red");

		color.fill();
		shape.draw();
	}
}