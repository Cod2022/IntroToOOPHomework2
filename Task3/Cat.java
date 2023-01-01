package Task3;

public class Cat extends Pet{
    
    Cat(String name) {
        super(name);
    }

    @Override
    public String call(String call) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void response(String call) {
        if (call == "кис-кис!") {
            System.out.println(name + " подошла к хозяину");
        }
    }
}
