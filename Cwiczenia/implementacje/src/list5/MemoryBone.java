package list5;

public class MemoryBones {
    String producer;
    String model;
    int capacity;
    String unit = "GB";

    public MemoryBones(String producer, String model, int capacity, String unit) {
        this.producer = producer;
        this.model = model;
        this.capacity = capacity;
    }

    public MemoryBones(String producer, String model, int capacity) {
        this.producer = producer;
        this.model = model;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "MemoryBone{" + producer +" "+ model +" "+ capacity + unit+"}";
    }
}
