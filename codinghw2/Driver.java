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
        retirementRate = 0.0;
        pitLap = 0;
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
        this.qualifyingTime = qualifyingTime;
    }

    public double getTotalTime() {
        return totalTime;
    }

    // Complete this method.
    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    /*
     * Add time to the driver's current total time.
     */
    public void addTime(double time) {
        totalTime += time;
    }

    public double getRetirementRate() {
        return retirementRate;
    }

    // Complete this method.
    public void setRetirementRate(double retirementRate) {
        this.retirementRate = retirementRate;
    }

    public int getPitLap() {
        return pitLap;
    }

    // Complete this method.
    public void setPitLap(int pitLap) {
        this.pitLap = pitLap;
    }

    public boolean isRetired() {
        return retired;
    }

    /*
     * Mark this driver as retired.
     */
    public void retire() {
        retired = true;
    }

    public boolean hasPitted() {
        return pitted;
    }

    /*
     * Mark that this driver has completed a pit stop.
     */
    public void pit() {
        pitted = true;
    }
}