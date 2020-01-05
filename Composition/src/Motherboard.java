public class Motherboard {
    private String manufacturer;
    private String model;
    private int ramSlots;
    private int cardSLots;
    private String bios;

    public Motherboard(String manufacturer, String model, int ramSlots, int cardSLots, String bios) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ramSlots = ramSlots;
        this.cardSLots = cardSLots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSLots() {
        return cardSLots;
    }

    public String getBios() {
        return bios;
    }
}
