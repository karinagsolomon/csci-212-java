import java.util.ArrayList;
import java.util.Random;

public class Race {
    public static final int TOTAL_LAPS = 55;

    private ArrayList<Team> teams;
    private ArrayList<Driver> drivers;
    private Random random;

    public Race(ArrayList<Team> teams) {
        this.teams = teams;
        random = new Random();

        drivers = new ArrayList<Driver>();

        for (Team team : teams) {
            drivers.add(team.getDriver1());
            drivers.add(team.getDriver2());
        }
    }

    /*
     * Main race procedure.
     */
    public void run() {
        prepareRace();

        System.out.println("===== QUALIFYING =====");
        runQualifying();

        System.out.println("\n===== RACE =====");

        for (int lap = 1; lap <= TOTAL_LAPS; lap++) {
            System.out.println("\nLap " + lap);

            runNormalLap(lap);

            printStandings();
        }
        
        System.out.println("\n===== FINAL RESULT =====");
        printFinalResult();
    }

    /*
     * PART 1
     *
     * For every team:
     * 1. Give each driver a random pit lap.
     * 2. The two teammates cannot have the same pit lap.
     * 3. Give each driver a retirement rate from
     *    the team's allowed range.
     */
    private void prepareRace() {



    }

    /*
     * PART 2
     *
     * Give every driver one qualifying lap.
     * Sort the drivers based on qualifying time.
     *
     * Starting race gaps:
     * P1 = 0.0 seconds
     * P2 = 0.5 seconds
     * P3 = 1.0 seconds
     * ...
     */
    private void runQualifying() {



    }

    /*
     * PART 3
     *
     * Simulate one lap for every active driver.
     * If the driver has already retired, do nothing.
     * A driver:
     * - may retire
     * - receives a random lap time
     * - pits if this is the driver's pit lap
     */
    private void runNormalLap(int lap) {

    	

    }

    /*
     * PART 4
     * 
     * Print the standing for each lap.
     * Print the active drivers from first to last.
     * The leader's gap is 0.
     * Other gaps are measured relative to the leader.
     */
    private void printStandings() {



    }
    
    // Print the final result
    // Helpful to your PART 4 programming
    private void printFinalResult() {
        ArrayList<Driver> active =
            getActiveDrivers();

        sortByRaceTime(active);

        int position = 1;

        for (Driver d : active) {
            System.out.printf(
                "%2d. %-12s %-12s %.3f%n",
                position,
                d.getName(),
                d.getTeam().getName(),
                d.getTotalTime()
            );

            position++;
        }

        System.out.println("\nRetired:");

        for (Driver d : drivers) {
            if (d.isRetired()) {
                System.out.println(
                    d.getName()
                    + " (" + d.getTeam().getName() + ")"
                );
            }
        }
    }


    /*
     * ==========================
     * PROVIDED HELPER METHODS
     * ==========================
     */

    private ArrayList<Driver> getActiveDrivers() {
        ArrayList<Driver> active =
            new ArrayList<Driver>();

        for (Driver driver : drivers) {
            if (!driver.isRetired()) {
                active.add(driver);
            }
        }

        return active;
    }

    private int randomLap() {
        return randomInt(1, TOTAL_LAPS);
    }

    // Generate random int between min to max
    private int randomInt(int min, int max) {
        return min +
            random.nextInt(max - min + 1);
    }

    private void sortByQualifyingTime(
        ArrayList<Driver> list
    ) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0;
                 j < list.size() - 1 - i;
                 j++) {

                if (list.get(j).getQualifyingTime()
                    >
                    list.get(j + 1).getQualifyingTime()) {

                    Driver temp = list.get(j);

                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    private void sortByRaceTime(
        ArrayList<Driver> list
    ) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0;
                 j < list.size() - 1 - i;
                 j++) {

                if (list.get(j).getTotalTime()
                    >
                    list.get(j + 1).getTotalTime()) {

                    Driver temp = list.get(j);

                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}