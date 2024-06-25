package zoomanagementsystem.models;

import java.time.LocalDate;

public class Llama extends AbstractAnimal implements LargeAnimal {
    public Llama(LocalDate dateOfBirth) {
        super(dateOfBirth);
    }
}
