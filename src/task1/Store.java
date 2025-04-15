package task1;

public class Store {
    private static int winner;
    private static int distance;

    public static void setWinner(int winner) {
        Store.winner = winner;
    }

    public static void setDistance(int distance) {
        Store.distance = distance;
    }

    public static int getWinner() {
        return winner;
    }

    public static int getDistance() {
        return distance;
    }
}
