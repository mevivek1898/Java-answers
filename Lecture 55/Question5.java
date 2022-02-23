public interface House {
    @Deprecated
    void open();
    void openFrontDoor();
    void openBackDoor()
}
public class MyHouse implements House {
    public void open() {}
    public void openFrontDoor() {}
    public void openBackDoor() {}
}
If you compile this program, the compiler produces a warning because open was deprecated in the interface. What can you do to get rid of that warning?. Choose the correct answer from the following.



Answers

Suppress the warning by using @SuppressWarnings("deprecation")