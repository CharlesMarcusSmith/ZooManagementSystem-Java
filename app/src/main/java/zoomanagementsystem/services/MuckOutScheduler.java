package zoomanagementsystem.services;

import zoomanagementsystem.models.Animal;
import zoomanagementsystem.models.AnimalThatCanBeGroomed;
import zoomanagementsystem.models.CanBeMuckedOut;
import zoomanagementsystem.models.Keeper;

import java.util.List;

public class MuckOutScheduler {
    private static MuckOutScheduler instance;

    private MuckOutScheduler() {
    }

    public static MuckOutScheduler getInstance() {
        if (instance == null) {
            instance = new MuckOutScheduler();
        }
        return instance;
    }

    public void assignMuckOutJobs(List<Keeper<? extends Animal>> keepers) {
        keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(animal -> {
            if (animal instanceof CanBeMuckedOut) {
                keeper.muckOut((CanBeMuckedOut) animal);
            }
        }));
    }
}
