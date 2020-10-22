package pl.sdacademy.JavaAdvanced.ex16;

import java.time.LocalDate;
import java.util.Optional;

public enum Runner {
    BEGINNER(Runner.LIMIT_2, Integer.MAX_VALUE),
    INTERMEDIATE(Runner.LIMIT_1, Runner.LIMIT_2),
    ADVANCED(0, Runner.LIMIT_1);

    private int minTime;
    private int maxTime;
    private static final int LIMIT_1 = 70;
    private final static int LIMIT_2 = 110;

    public static Optional<Runner> getFitnessLevel(int time) {
        if (time <= Runner.ADVANCED.maxTime && time > Runner.ADVANCED.minTime) {
            return Optional.of(ADVANCED);
        }
        if (time <= Runner.INTERMEDIATE.maxTime && time > Runner.INTERMEDIATE.minTime) {
            return Optional.of(INTERMEDIATE);
        }
        if (time <= Runner.BEGINNER.maxTime && time > Runner.BEGINNER.minTime) {
            return Optional.of(BEGINNER);
        }
        return Optional.empty();
    }

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }
}
