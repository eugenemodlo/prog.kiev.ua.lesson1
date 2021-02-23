package prog.kiev.ua.lesson1;

public class Phone {
    private String number;
    private Network network;

    public Phone(String number) {
        this.number = number;
    }

    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", network=" + network +
                '}';
    }

    public void registerToNet(Network network) {
        network.addPhone(this);
        this.network = network;
    }

    public void call(String phoneNumber) {
        this.network.connect(this, phoneNumber);
    }
    public void incomingCall() {
        System.out.println("Incoming call!");
    }
}
