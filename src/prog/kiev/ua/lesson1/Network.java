package prog.kiev.ua.lesson1;

import java.util.Arrays;

public class Network {
    private String networkName;

    private Phone[] phonePool;

    public Network(String networkName, int phoneAmount) {
        this.networkName = networkName;
        phonePool = new Phone[phoneAmount];
    }

    public Network() {
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public Phone[] getPhonePool() {
        return phonePool;
    }

    public void setPhonePool(Phone[] phonePool) {
        this.phonePool = phonePool;
    }

    public void addPhone(Phone phone) {
        if (phone.getNetwork() == null) {
            for (int i = 0; i < this.phonePool.length; i++) {
                if (this.phonePool[i] == null) {
                    this.phonePool[i] = phone;
                    break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Network{" +
                "networkName='" + networkName + '\'' +
                '}';
    }

    public void connect(Phone phone, String phoneNumber) {
        boolean isNumber = false;
        for (Phone lookupPhone : this.phonePool) {
            if (lookupPhone != null && lookupPhone.getNumber().equals(phoneNumber)) {
                phone.incomingCall();
                isNumber = true;
                break;
            }
        }
        if (!isNumber) {
            System.out.println("Number not found!");
        }
    }
}
