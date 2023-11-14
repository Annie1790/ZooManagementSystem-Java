package zoomanagementsystem.models;

import java.time.LocalDate;

public class GuineaFowl extends AbstractAnimal implements SmallAnimal {
    public GuineaFowl(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }
}
