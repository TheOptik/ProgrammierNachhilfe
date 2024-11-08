package mosaik;

import java.util.Arrays;

public class Mosaikpuzzle {

    private boolean[][] puzzle;

    public Mosaikpuzzle(boolean[][] puzzle) {
        this.puzzle = puzzle;
    }


    public static void main(String[] args) {

        boolean[][] puzzle = new boolean[][]{
                {false, false, true, false, true, false, false, false, false, false},
                {false, false, true, true, true, false, false, false, false, false},
                {false, false, true, true, true, false, false, false, true, false},
                {false, false, true, true, true, false, false, true, false, false},
                {false, false, true, true, false, false, false, true, true, false},
                {false, false, true, true, true, true, false, false, true, true},
                {false, false, true, true, true, true, true, false, false, true},
                {false, true, true, true, true, true, true, false, false, true},
                {false, false, false, false, true, true, true, false, true, true},
                {false, false, false, true, true, true, true, true, true, false},
        };

        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                System.out.print(puzzle[i][j] ? "X" : " ");
            }
            System.out.println();
        }

        Mosaikpuzzle mosaik = new Mosaikpuzzle(puzzle);

        System.out.println(mosaik.ermittleHinweiszahl(0,3));
        System.out.println(mosaik.ermittleHinweiszahl2(0,3));
        System.out.println(mosaik.ermittleHinweiszahl3(0,3));

        System.out.println(mosaik.ermittleHinweiszahl(6,5));
        System.out.println(mosaik.ermittleHinweiszahl2(6,5));
        System.out.println(mosaik.ermittleHinweiszahl3(6,5));

        System.out.println(Arrays.deepToString(mosaik.konvertiereZuHinweiszahlen()));
        System.out.println(Arrays.deepToString(mosaik.konvertiereZuHinweiszahlen2()));
        System.out.println(Arrays.deepToString(mosaik.konvertiereZuHinweiszahlen3()));

    }


    public int[][] konvertiereZuHinweiszahlen() {
        int[][] result = new int[puzzle.length][puzzle[0].length];
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                result[i][j] = ermittleHinweiszahl(i, j);
            }
        }

        return result;
    }

    public int[][] konvertiereZuHinweiszahlen2() {
        int[][] result = new int[puzzle.length][puzzle[0].length];
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                result[i][j] = ermittleHinweiszahl2(i, j);
            }
        }

        return result;
    }

    public int[][] konvertiereZuHinweiszahlen3() {
        int[][] result = new int[puzzle.length][puzzle[0].length];
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                result[i][j] = ermittleHinweiszahl3(i, j);
            }
        }

        return result;
    }

    public int ermittleHinweiszahl(int zeile, int spalte) {
        int hinweiszahl = 0;

        for (int i = 0; i < 3; i++) {
            int zeilenIndex = zeile - 1 + i;
            for (int j = 0; j < 3; j++) {
                int spaltenIndex = spalte - 1 + j;
                if (
                        zeilenIndex >= 0 && spaltenIndex >= 0 &&
                                zeilenIndex < puzzle.length && spaltenIndex < puzzle[0].length &&
                                puzzle[zeilenIndex][spaltenIndex]
                ) {
                    hinweiszahl += 1;
                }
            }
        }
        return hinweiszahl;
    }

    public int ermittleHinweiszahl2(int zeile, int spalte) {
        int hinweiszahl = 0;

        int x1 = zeile - 1;
        int x2 = zeile;
        int x3 = zeile + 1;

        int y1 = spalte - 1;
        int y2 = spalte;
        int y3 = spalte + 1;

        if (x1 >= 0 && x1 < puzzle.length && y1 >= 0 && y1 < puzzle[x1].length && puzzle[x1][y1]) {
            hinweiszahl++;
        }
        if (x1 >= 0 && x1 < puzzle.length && y2 >= 0 && y2 < puzzle[x1].length && puzzle[x1][y2]) {
            hinweiszahl++;
        }
        if (x1 >= 0 && x1 < puzzle.length && y3 >= 0 && y3 < puzzle[x1].length && puzzle[x1][y3]) {
            hinweiszahl++;
        }
        if (x2 >= 0 && x2 < puzzle.length && y1 >= 0 && y1 < puzzle[x2].length && puzzle[x2][y1]) {
            hinweiszahl++;
        }
        if (x2 >= 0 && x2 < puzzle.length && y2 >= 0 && y2 < puzzle[x2].length && puzzle[x2][y2]) {
            hinweiszahl++;
        }
        if (x2 >= 0 && x2 < puzzle.length && y3 >= 0 && y3 < puzzle[x2].length && puzzle[x2][y3]) {
            hinweiszahl++;
        }
        if (x3 >= 0 && x3 < puzzle.length && y1 >= 0 && y1 < puzzle[x3].length && puzzle[x3][y1]) {
            hinweiszahl++;
        }
        if (x3 >= 0 && x3 < puzzle.length && y2 >= 0 && y2 < puzzle[x3].length && puzzle[x3][y2]) {
            hinweiszahl++;
        }
        if (x3 >= 0 && x3 < puzzle.length && y3 >= 0 && y3 < puzzle[x3].length && puzzle[x3][y3]) {
            hinweiszahl++;
        }

        return hinweiszahl;
    }


    public int ermittleHinweiszahl3(int zeile, int spalte) {
        int hinweiszahl = 0;
        for (int i = 0; i < puzzle.length; i++) {
            for (int j = 0; j < puzzle[i].length; j++) {
                if (zeile - i == -1 || zeile - i == 0 || zeile - i == 1) {
                    if (spalte - j == -1 || spalte - j == 0 || spalte - j == 1) {
                        if (puzzle[i][j]) {
                            hinweiszahl++;
                        }
                    }
                }
            }
        }

        return hinweiszahl;
    }


}
