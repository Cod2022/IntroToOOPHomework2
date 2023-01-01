package Task3;

public class Person implements Callable{
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public String call (String call) {
        return call;
    }

    @Override
    public void response(String call) {
        // TODO Auto-generated method stub
        
    }
}
