public class RAM {
    int volume;
    String ramBrand;


    public RAM(int volume, String ramBrand) {
        this.volume = volume;
        this.ramBrand = ramBrand;
    }

    @Override
    public String toString() {
        return "RAM{" +
                "volume=" + volume +
                ", ramBrand='" + ramBrand + '\'' +
                '}';
    }
}
