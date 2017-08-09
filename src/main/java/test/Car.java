package test;

/**
 * Created by Maksym_Hromyk on 18.07.2017.
 */
public class Car {
    private String model;

    private String plate;


    public Car(String model, String plate) {
        this.model = model;
        this.plate = plate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
}
