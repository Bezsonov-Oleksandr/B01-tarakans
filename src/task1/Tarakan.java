package task1;

public class Tarakan implements Runnable {
    private int id;
    private int distance;

    public Tarakan(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        int raceDistance = Store.getDistance();

        while (true) {
            distance++;
            System.out.printf("Tarakan %d. --> %d\n", id, distance);

            if (distance == raceDistance) {
                if (Store.getWinner() == 0) {
                    Store.setWinner(id);
                }
                return;
            }

            double random4 = Math.random() * 4;
            int randomSleep = (int) random4 + 2;
            try {
                Thread.sleep(randomSleep);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
