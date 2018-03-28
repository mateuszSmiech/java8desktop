package pl.msmiech.java8desktop;

class Defibrillator {

    private int number;
    private String name;
    private String address;
    private String phoneNumber;
    private Point location;

    public static Defibrillator createDefibrillator(String description) {

        String[] tokens = description.split(";");
        Defibrillator defibrillator = new Defibrillator();
        defibrillator.number = Integer.parseInt(tokens[0]);
        defibrillator.name = tokens[1];
        defibrillator.address = tokens[2];
        defibrillator.phoneNumber = tokens[3];
        defibrillator.location = new Point(StringUtils.toDouble(tokens[4]), StringUtils.toDouble(tokens[5]));
        return defibrillator;
    }

    public String getName() {
        return name;
    }

    public Point getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Defibrillator: number=" + number +
                ", name=" + name +
                ", address=" + address +
                ", phoneNumber=" + phoneNumber +
                ", location=" + location.toString();
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}