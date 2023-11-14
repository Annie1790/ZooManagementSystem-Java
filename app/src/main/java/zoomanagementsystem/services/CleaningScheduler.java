package zoomanagementsystem.services;

import zoomanagementsystem.models.Animal;
import zoomanagementsystem.models.CanBeGroomed;
import zoomanagementsystem.models.CanHaveMuckSweptOut;
import zoomanagementsystem.models.Keeper;

import java.util.List;
    public class CleaningScheduler implements Scheduler {
        private static CleaningScheduler instance;

        private CleaningScheduler() {
        }

        public static CleaningScheduler getInstance() {
            if (instance == null) {
                instance = new CleaningScheduler();
            }
            return instance;
        }

        @Override
        public void assignJobs(List<Keeper<? extends Animal>> keepers) {
            keepers.forEach(keeper -> keeper.getResponsibleAnimals().forEach(animal -> {
                if (animal instanceof CanHaveMuckSweptOut) {
                    keeper.clean((CanHaveMuckSweptOut) animal);
                }
            }));
        }
    }
