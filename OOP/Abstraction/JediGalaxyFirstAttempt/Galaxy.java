package Abstraction.JediGalaxyFirstAttempt;

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
        for (int i = x; i >= 0; i--) {
            if (y >= 0 && y < galaxyMap.length && i < galaxyMap[0].length) {
                galaxyMap[y][i] = 0;
            }
            y--;
        }
    }

    public long moveJedi(long sum, int x, int y) {

        for (int i = y; i >= 0; i--) {
            if (i < galaxyMap.length && x >= 0 && x < galaxyMap[0].length) {
                sum += galaxyMap[i][x];
            }
            x++;
        }
        return sum;
    }
}
