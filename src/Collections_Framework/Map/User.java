package Collections_Framework.Map;

public class User {
    @Override
    public String toString() {
        return "User";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalized called");
    }
}
