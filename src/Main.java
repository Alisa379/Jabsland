//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String [][] a = new String[7][7];
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j <= 6; j++) {
                a[3][3] = "0";
                a[0][6] = "Ded";
                a[0][0] = "Vik";
                if ((((i==0 | i == 6) & (j!=3))) | ((j==0 | j==6) & (i!=3))) {
                    a[i][j] = "\u00B7";
                } else if ((j == 3)&(i!=3)) {
                    if (i < 3) {
                        a[i][j] = "N-" + (3-i);
                    }
                    else {
                        a[i][j] = "S-" + (i-3);
                    }
                } else if (i==3 & j != 3) {
                    if (j < 3) {
                        a[i][j] = "W-" + (3-j);
                    }
                    else {
                        a[i][j] = "E-" + (j-3);
                    }
                } else if (i==j) {
                    if (i<3){
                        a[i][j] = "NW" + (4-i);
                    }
                    else {
                        a[i][j] = "SE" + (i-2);
                    }
                } else if (i+j == 6){
                    if (j > 3) {
                        a[i][j] = "NE" + (j-2);
                    }
                    else {
                        a[i][j] = "SW" + (i-1);
                    }
                }

                else {
                    a[i][j] = "\u00B7";
                }
            }
        }

        for (int x = 0; x <= 6; x++) {
            for (int y = 0; y <= 6; y++) {
                if (a[x][y].length() < 3) {
                    System.out.print(" " + a[x][y] + "  ");
                }
                else System.out.print("" + a[x][y] + " ");
            }
            System.out.println();
        }
    }
}