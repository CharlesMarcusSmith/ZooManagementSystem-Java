package zoomanagementsystem.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Rabbit extends AnimalThatCanBeGroomed implements SmallAnimal {

    private LocalDateTime lastGroomed;

    public Rabbit(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }
}
