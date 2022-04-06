package by.epam.pattern.factory;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;
		
		if (type.equals("cheese"))
			pizza = new ChicagoStyleCheesePizza();
		
		return pizza;
		
	}

}