package zoomanagementsystem.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lion extends AbstractAnimal implements LargeAnimal, CanHaveMuckSweptOut {
    private LocalDateTime lastCleaned;
    public Lion(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    @Override
    public void clean() {
        lastCleaned = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Cleaned {1}", super.toString(), lastCleaned);
    }
}
