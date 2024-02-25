package yl_8_13;

public class LocateSmallest {
    public static void main(String[] args) {
        double[][] matrix =
                {{23.5, 35, 2, 10},
                {4.5, 3, 45, 3.5},
                {35, 44, 5.5, 9.6}};
        for (int i : locateSmallest(matrix)) {
            System.out.println(i);
        }
    }

        public static int[] locateSmallest ( double[][] array){
            double smallest = array[0][0];
            int x = 0;
            int y = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] < smallest) {
                        smallest = array[i][j];
                        x = i;
                        y = j;
                    }
                }
            }
            return new int[]{x, y};
        }
    }
