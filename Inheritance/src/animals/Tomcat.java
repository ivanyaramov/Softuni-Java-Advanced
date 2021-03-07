package animals;

public class Tomcat extends Cat{
    static final String gender="Male";
    public Tomcat(String name, int age) {
        super(name, age, gender);
    }
@Override
    public String produceSound(){
        return "MEOW";
    }
}
