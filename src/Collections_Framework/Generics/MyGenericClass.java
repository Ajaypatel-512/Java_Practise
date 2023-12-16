package Collections_Framework.Generics;

public class MyGenericClass<T> {

    T obj;
    MyGenericClass(T obj){
        this.obj = obj;
    }

    public void displayObjectDetails(){
        System.out.println("The Type of Object : "+obj.getClass().getName());
    }

    public T getObj(){
        return obj;
    }

}
