package wildfarm;

import java.text.DecimalFormat;

public abstract class Mammal extends Animal {
    private String livingRegion;
    public Mammal(String animalName, String animalType, Double animalWeight,String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion=livingRegion;
    }

    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }



    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("###.###");


        return String.format("%s[%s, %s, %s, %d]",this.animalType,this.animalName,df.format(this.animalWeight),this.livingRegion,this.foodEaten);
    }
}
