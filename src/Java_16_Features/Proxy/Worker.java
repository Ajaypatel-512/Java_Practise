package Java_16_Features.Proxy;

public interface Worker {
    default String work(){
        return "Done";
    }
}
