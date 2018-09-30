public enum PlaneType {

    AIRBUS_A320(380),
    AIRBUS_A380(518),
    BOEING_767(2),
    BOEING_777(214),
    BOEING_787(164);

    private final int capacity;

    PlaneType(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

}

