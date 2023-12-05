package Java_15_Features.Sealed_classes;

public non-sealed class FiveSeries extends SealedClass {

    public int start(){
        record PickupData(int pickupTime){

        }
        return new PickupData(10).pickupTime;
    }
}
