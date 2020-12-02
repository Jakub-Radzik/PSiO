package training.GenericPackage;

public class YourTypeClass<T> {
    private T thing;

    public YourTypeClass(T thing) {
        this.thing = thing;
    }

    public T getThing() {
        return thing;
    }

    public void setThing(T thing) {
        this.thing = thing;
    }

    public String getType(){
        return thing.getClass().getName();
    }
}
