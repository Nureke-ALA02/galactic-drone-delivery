package edu.narxoz.galactic.Demo;

import edu.narxoz.galactic.bodies.*;
import edu.narxoz.galactic.cargo.*;
import edu.narxoz.galactic.drones.*;
import edu.narxoz.galactic.dispatcher.*;
import edu.narxoz.galactic.task.*;

public class Demo {
    public static void main(String[] args) {
        Planet earth = new Planet("Earth", 0, 0, "Oxygen");
        SpaceStation iss = new SpaceStation("ISS", 100, 0, 5);

        Cargo cargo = new Cargo(50, "Supplies");

        DeliveryTask task = new DeliveryTask(earth, iss, cargo);

        LightDrone light = new LightDrone("LD-1", 10);
        HeavyDrone heavy = new HeavyDrone("HD-1", 100);

        Dispatcher dispatcher = new Dispatcher();

        System.out.println("Assign LightDrone: " + dispatcher.assignTask(task, light));
        System.out.println("Assign HeavyDrone: " + dispatcher.assignTask(task, heavy));
        System.out.println("Estimated time: " + task.estimateTime());
        System.out.println("Complete task: " + dispatcher.completeTask(task));
        System.out.println("Drone status: " + heavy.getStatus());
        System.out.println("Task state: " + task.getState());
    }
}
