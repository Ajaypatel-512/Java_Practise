package core_java_made_easy.Sealed_classes;

public non-sealed class FiveSeries extends SealedClass {

    public int start(){
        record PickupData(int pickupTime){

        }
        return new PickupData(10).pickupTime;
    }
}
