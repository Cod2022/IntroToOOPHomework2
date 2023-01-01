package Task3;

public class Dog extends Pet{

    Dog(String name) {
        super(name); 
    }
    @Override
    public String call(String call) {
        // TODO Auto-generated method stub
        return null;
    }

    public void response(String call) {
        if (call == "Ко мне!") {
            System.out.println(name + " подошла к хозяину");
        }
    }
}
