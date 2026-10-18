import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        ArrayList<Team> teams =
            new ArrayList<Team>();

        teams.add(new Team(
            "Fed Full",
            "MV3", "IH6",
            88.0, 90.0,
            20.0, 21.0,
            0.001, 0.003
        ));

        teams.add(new Team(
            "Red Horse",
            "CL16", "LH44",
            88.0, 88.5,
            20.0, 23.0,
            0.000, 0.002
        ));

        teams.add(new Team(
            "QCL",
            "LN1", "OP81",
            88.1, 88.8,
            20.5, 23.5,
            0.003, 0.006
        ));

        teams.add(new Team(
            "Bro Bens",
            "KA12", "GR63",
            87.6, 88.2,
            20.0, 21.5,
            0.001, 0.004
        ));

        teams.add(new Team(
            "Racing Fool",
            "LL30", "AL41",
            88.8, 90.6,
            20.5, 22.0,
            0.001, 0.003
        ));

        teams.add(new Team(
            "Four Circles",
            "GB5", "NH27",
            88.8, 91.0,
            21.0, 22.5,
            0.005, 0.01
        ));

        teams.add(new Team(
            "HDL",
            "EO31", "OB87",
            89.2, 91.4,
            22.0, 23.5,
            0.002, 0.005
        ));

        teams.add(new Team(
            "Ai Pain",
            "PG10", "FC43",
            88.9, 90.8,
            20.0, 21.5,
            0.001, 0.003
        ));

        teams.add(new Team(
            "W Team",
            "AA23", "CS55",
            89.5, 92.0,
            20.0, 22.0,
            0.002, 0.004
        ));

        teams.add(new Team(
            "Magic",
            "FA14", "LS18",
            89.2, 95.0,
            20.0, 22.0,
            0.01, 0.015
        ));

        teams.add(new Team(
            "US",
            "SP11", "VB77",
            92.0, 94.0,
            21.0, 23.0,
            0.008, 0.012
        ));

        Race race = new Race(teams);

        race.run();
    }
}