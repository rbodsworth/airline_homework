public class Pilot {

    private String name;
    private int licenseNumber;

    public Pilot(String name, int licenseNumber){
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }
}