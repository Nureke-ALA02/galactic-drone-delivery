package edu.narxoz.galactic.factory;
import edu.narxoz.galactic.drones.*;
public class DroneFactory {
    private DroneFactory() {}
    public static Drone createLight(String id, double payload) {
        return new LightDrone(id, payload);
    }
    public static Drone createHeavy(String id, double payload) {
        return new HeavyDrone(id, payload);
    }
}
