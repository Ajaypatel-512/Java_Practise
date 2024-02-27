package core_java_made_easy.Java_16_Features.Proxy;

public interface Worker {
    default String work(){
        return "Done";
    }
}
