package by.epam.pattern.strategy;

public class Main {

	public static void main(String[] args) {

		Duck duck = new MallardDuck();
		duck.display();
		duck.performFly();
		duck.performQuack();

	}

}
