package zoomanagementsystem.models;

import java.text.MessageFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Lion extends AbstractAnimal implements LargeAnimal, CanBeMuckedOut {
    public Lion(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }

    private LocalDateTime lastMuckedOut;

    @Override
    public void muckOut() {
        lastMuckedOut = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0}; Last Mucked Out {1}", super.toString(), lastMuckedOut);
    }
}
