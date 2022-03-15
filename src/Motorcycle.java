public class Motorcycle extends Vehicle {
    private int numOfLights;

    public Motorcycle (String name, int wheels, int numOfLights)
    {
        super(name, wheels);
        this.numOfLights = numOfLights;
    }

    public int getNumOfLights()
    {
        return numOfLights;
    }

    public void sound()
    {
        System.out.println("Vroom! Vrooom! Vroooom! ");
    }
}
