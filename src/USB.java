public class USB {
    String typePorts;
    String idPort;

    public USB(String typePorts, String idPort) {
        this.typePorts = typePorts;
        this.idPort = idPort;
    }

    @Override
    public String toString() {
        return "USB{" +
                "typePorts='" + typePorts + '\'' +
                ", idPort='" + idPort + '\'' +
                '}';
    }
}
