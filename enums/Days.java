package enums;

/**
 * @author zhang
 */

public enum Days {
    zgd("张国ding","成都"),zdx("zdx","内江");
    private String name;
    private String address;



    Days() {
    }

    Days(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Days{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
