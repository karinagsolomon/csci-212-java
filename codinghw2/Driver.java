public class Driver {
    private String name;
    private Team team;

    private double qualifyingTime;
    private double totalTime;
    private double retirementRate;

    private int pitLap;

    private boolean retired;
    private boolean pitted;


    // Complete this constructor.
    public Driver(String name, Team team) {
        this.name = name;
        this.team = team;
    }

    public void reset() {
        qualifyingTime = 0.0;
        totalTime = 0.0;
        retired = false;
        pitted = false;
    }

    public String getName() {
        return name;
    }

    public Team getTeam() {
        return team;
    }

    public double getQualifyingTime() {
        return qualifyingTime;
    }

    // Complete this method.
    public void setQualifyingTime(double qualifyingTime) {
        qualifyingTime = 0.0;
    }

    public double getTotalTime() {
        return totalTime;
    }

    // Complete this method.
    public void setTotalTime(double totalTime) {

    }

    /*
     * Add time to the driver's current total time.
     */
    public void addTime(double time) {

    }

    public double getRetirementRate() {
        return retirementRate;
    }

    // Complete this method.
    public void setRetirementRate(double retirementRate) {
        /* Each driver receives a random retirement rate within the range specified for the team.During each normal racing lap, determine whether the driver retires. Once a driver retires:
        ● the driver should not complete any additional laps
        ● the driver should no longer appear in the active race standings
        */
    }

    public int getPitLap() {
        return pitLap;
    }

    // Complete this method.
    public void setPitLap(int pitLap) {
        // During each normal racing lap, an active driver receives a random lap time within the range specified for the driver's team. The lap time should be added to the driver's accumulated race time.
        pitLap = random.nextInt();
        pitLap + addTime();
    }

    public boolean isRetired() {
        return retired;
    }

    /*
     * Mark this driver as retired.
     */
    public void retire() {
        isRetired();
    }

    public boolean hasPitted() {
        return pitted;
    }

    /*
     * Mark that this driver has completed a pit stop.
     */
    public void pit() {
        hasPitted();
    }
}