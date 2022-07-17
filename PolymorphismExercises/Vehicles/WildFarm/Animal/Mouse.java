package WildFarm.Animal;

import WildFarm.Food.Food;
import WildFarm.Food.Meat;
import WildFarm.Messages;

public class Mouse extends Mammal {
    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(Messages.MOUSE_SOUND);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            throw new IllegalArgumentException(String.format(Messages.WRONG_FOOD, "Mice"));
        }
        super.eat(food);
    }
}
