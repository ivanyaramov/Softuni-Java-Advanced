package wildfarm;

public class Tiger extends Feline {
    public Tiger(String animalName , Double animalWeight, String livingRegion) {
        super(animalName, "Tiger", animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }
    @Override
    public void eat(Food food) {
        if(food instanceof Meat){
            this.foodEaten+=food.getQuantity();
        }
        else{
            System.out.printf("Tigers are not eating that type of food!%n");
        }
    }
}
