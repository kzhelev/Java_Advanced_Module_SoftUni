package Abstraction.JediGalaxy;

public class Galaxy {
    private int[][] galaxyMap;

    public Galaxy(int x, int y) {
        galaxyMap = new int[x][y];

        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                galaxyMap[i][j] = value++;
            }
        }
    }

    public int[][] getGalaxyMap() {
        return galaxyMap;
    }

    public void moveEvil(int x, int y) {

        while (x >= 0 && y >= 0) {

            if (x >= 0 && y < galaxyMap.length && y >= 0 && y < galaxyMap[0].length) {
                galaxyMap[x][y] = 0;
            }
            x--;
            y--;

        }
    }

    public long moveJedi(long sum, int x, int y) {

        while (x >= 0 && y < galaxyMap[1].length) {

            if (x >= 0 && x < galaxyMap.length && y >= 0 && y < galaxyMap[0].length) {
                sum += galaxyMap[x][y];
            }

            y++;
            x--;
        }
        return sum;
    }
}
