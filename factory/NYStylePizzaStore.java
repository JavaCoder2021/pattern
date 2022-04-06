package by.epam.pattern.factory;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
	    if (type.equals("cheese"))
	        pizza = new NYStyleCheesePizza();
	    
		return pizza;
		
	}

}