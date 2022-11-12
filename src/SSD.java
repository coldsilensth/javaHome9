public class SSD {
    int size;
    int discs;

    public SSD(int size, int discs) {
        this.size = size;
        this.discs = discs;
    }

    @Override
    public String toString() {
        return "SSD{" +
                "size=" + size +
                ", discs=" + discs +
                '}';
    }
}
