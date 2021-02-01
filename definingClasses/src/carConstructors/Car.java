package carConstructors;

public class Car {
    private String brand;
   public String model;
    public int horsePower;
    public Car(String brand){
        this.brand=brand;
        this.model="unknown";
        this.horsePower=-1;
    }
    public Car(String brand,String model, int horsePower){
        this(brand);
        this.model=model;
        this.horsePower=horsePower;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
    public StringBuilder carInfo(){
        StringBuilder build=new StringBuilder();
        build.append("The car is: ");
        build.append(this.getBrand());
        build.append(" ");
        build.append(this.getModel());
        build.append(" - ");
        build.append(this.getHorsePower());
        build.append(" HP.");

        return build;
    }
}


