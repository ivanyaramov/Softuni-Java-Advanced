package foodshortage;


public class Citizen implements Person,  Identifiable,Buyer {
    private String name;
    private int age;
    private String id;
    private String birthDate;
    private int food;

    public Citizen(String name, int age,String id,String birthDate) {
        this.name = name;
        this.age = age;
        this.id=id;
        this.birthDate=birthDate;
        this.food=0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public String getBirthDate() {
        return this.birthDate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void buyFood() {
        this.food+=10;
    }

    @Override
    public int getFood() {
        return this.food;
    }
}
