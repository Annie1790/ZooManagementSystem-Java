package zoomanagementsystem.services;

import zoomanagementsystem.models.Animal;
import zoomanagementsystem.models.Keeper;

import java.util.List;

public interface Scheduler {
    public void assignJobs(List<Keeper<? extends Animal>> keepers);
}
