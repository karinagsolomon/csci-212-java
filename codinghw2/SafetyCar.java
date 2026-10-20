public class SafetyCar {
    private int remainingLaps;

    public SafetyCar(int duration) {
        if (duration < 1) {
            throw new IllegalArgumentException(
                "Safety Car duration must be at least one lap."
            );
        }
        remainingLaps = duration;
    }

    public boolean isActive() {
        return remainingLaps > 0;
    }

    public int getRemainingLaps() {
        return remainingLaps;
    }

    public void completeLap() {
        if (isActive()) {
            remainingLaps--;
        }
    }
}
