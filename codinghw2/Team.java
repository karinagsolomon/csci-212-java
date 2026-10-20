import java.util.Random;

public class Team {
    private String name;

    private Driver driver1;
    private Driver driver2;

    private double minLapTime;
    private double maxLapTime;

    private double minPitTime;
    private double maxPitTime;

    // Probability PER LAP, such as 0.002 = 0.2%
    private double minRetirementRate;
    private double maxRetirementRate;

    public Team(
        String name,
        String driver1Name,
        String driver2Name,
        double minLapTime,
        double maxLapTime,
        double minPitTime,
        double maxPitTime,
        double minRetirementRate,
        double maxRetirementRate
    ) {
        this.name = name;

        this.minLapTime = minLapTime;
        this.maxLapTime = maxLapTime;

        this.minPitTime = minPitTime;
        this.maxPitTime = maxPitTime;

        this.minRetirementRate = minRetirementRate;
        this.maxRetirementRate = maxRetirementRate;

        driver1 = new Driver(driver1Name, this);
        driver2 = new Driver(driver2Name, this);
    }


    public String getName() {
        return name;
    }

    public Driver getDriver1() {
        return driver1;
    }

    public Driver getDriver2() {
        return driver2;
    }


    /*
     * Return one random lap time between
     * this team's minimum and maximum lap time.
     */
    public double generateLapTime(Random random) {
        return minLapTime + random.nextDouble() * (maxLapTime - minLapTime);
    }


    /*
     * Return one random pit time between
     * this team's minimum and maximum pit time.
     */
    public double generatePitTime(Random random) {
        return minPitTime + random.nextDouble() * (maxPitTime - minPitTime);
    }


    /*
     * Return a random retirement rate between
     * this team's minimum and maximum values.
     */
    public double generateRetirementRate(Random random) {
        return minRetirementRate
            + random.nextDouble() * (maxRetirementRate - minRetirementRate);
    }
}