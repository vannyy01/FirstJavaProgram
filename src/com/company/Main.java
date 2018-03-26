package com.company;
// Підключення до бібліотеки Swing

import javax.swing.*;
import java.util.Random;

//My first program on Java
public class Main {

    private static void product() {
        ProductFactory productFactory = new ProductFactory();
        productFactory.setCategory("drink");
        productFactory.setName("Guiness");
        productFactory.setAlcohol(2.3);
        productFactory.setCapacity(1);
        productFactory.setWeight(1.1);
        productFactory.setPrice(11);
        productFactory.getMerchandise().getProduct();
    }

    private static void urav() {

        String x2 = JOptionPane.showInputDialog("Введіть значення Х");
        if (x2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Х незадано");
            return;
        }
// Перетворення цифрових даних у числовий формат
        double x = Double.parseDouble(x2);
//Створення об’єктної змінної у з передачею параметрів
        Urav y = new Urav(0.245, 0.0498, 14);
        double y1;

        if (x < 0) {
            y1 = y.ur1();
        } else if (x > 0) {
            y1 = y.ur2(7, x);
        } else {
            y1 = y.ur3(6);
        }
        JOptionPane.showMessageDialog(null,
                "x = " + x + "\n" + "y=" + y1);
    }

    public static double[][] transMatrix(double matrix[][], int corner, boolean show) {
        if (matrix.length < 1 || matrix[0].length < matrix.length) {
            throw new ArrayStoreException("Too short array");
        }
        int M_len = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length < M_len) {
                throw new ArrayStoreException("Doesn`t enough arguments in the matrix");
            }
        }
        double[][] retArr = new double[M_len][matrix.length];
        if (corner == 90) {
            int retArrI = 0;
            int retArrJ = matrix.length - 1;
            for (double[] srI : matrix) {
                for (double srJ : srI) {
                    retArr[retArrI++][retArrJ] = srJ;
                }
                retArrI = 0;
                retArrJ--;
            }
        }
        if (corner == 180) {
            int retArrI = matrix.length - 1;
            int retArrJ = matrix.length - 1;
            for (double[] srI : matrix) {
                for (double srJ : srI) {
                    retArr[retArrI][retArrJ--] = srJ;
                }
                retArrI--;
                retArrJ = matrix.length - 1;
            }
        }
        if (corner == 270) {
            int retArrI = matrix.length - 1;
            int retArrJ = 0;
            for (double[] srI : matrix) {
                for (double srJ : srI) {
                    retArr[retArrI--][retArrJ] = srJ;
                }
                retArrI = matrix.length - 1;
                retArrJ++;
            }
        }
       if(show) {
           for (int i = 0; i < retArr.length; i++) {
               for (int j = 0; j < retArr[i].length; j++) {
                   System.out.print(retArr[i][j] + " ");
               }
               System.out.print(System.lineSeparator());
           }
           System.out.print(System.lineSeparator());
       }
        return retArr;
    }

    /**
     * @param matrix
     * @param corner
     * @param show
     * @return double retArr
     */
    public static double[][] transMatrixRec(double matrix[][], int corner, boolean show) {
        if (matrix.length < 1 || matrix[0].length < matrix.length) {
            throw new ArrayStoreException("Too short array");
        }
        int M_len = matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length < M_len) {
                throw new ArrayStoreException("Doesn`t enough arguments in the matrix");
            }
        }
        double[][] retArr = new double[M_len][matrix.length];
        if (corner == 90) {
            retArr = transMatrix(matrix, 90, show);
        }
        if (corner == 180) {
            retArr = transMatrix(transMatrix(matrix, 90 ,false),90,show);
        }
        if (corner == 270) {
            retArr = transMatrix(transMatrix(transMatrix(matrix, 90,false),90,false),90,show);
        }
        return retArr;
    }

    public static void matrix() {
        double[][] matrix = new double[4][4];
        double t = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                // Random rnd = new Random(System.currentTimeMillis());
                // double y = matrix[i][j] = rnd.nextInt(100);
                double y = matrix[i][j] = t;
                System.out.print(y + " ");
                t++;
            }
            System.out.print(System.lineSeparator());
        }
        System.out.print("======================");
        System.out.print("\nTurned\n");
        transMatrixRec(matrix, 270,true);
    }

    public static void main(String[] args) {
       /* int y = 0, x = 0;
        while (x < 5) {
            y = y + 2;
            if (y > 4) {
                y = y - 1;
            }
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                x = x + 2;
                System.out.print(" oyster");
            }
            if (x == 1) {
                System.out.print("noys");

            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println(" ");
            x = x + 1;

        }**/
        matrix();
        //urav();
        //product();
        /** try {
         PatientsList patientsList;
         patientsList = new PatientsList(5);

         patientsList.Insert("Alex", "Volobuydimir", "st.bg 15/12", "+342231454223", 9999966, "lawyer", "Smith");
         patientsList.Insert("gggg", "Volodimir", "st.Goglytbyta 15/12", "+342231244223", 6464565, "lawyer", "Smiytyth");
         patientsList.Insert("Alyttbyex", "Volobydimir", "st.Gtyoglya 15/12", "+3454531244223", 565464, "lawyer", "tyyty");
         patientsList.Insert("Abuylex", "Volodimir", "st.Gogtylya 15/12", "+342231244223", 564545, "lawyer", "Smytyith");
         patientsList.Insert("Aluuyex", "buy", "st.Goglytyya 15/12", "+344531244223", 4565645, "lawyer", "Smytybtith");
         patientsList.getPatientsList();
         } catch (Exception e) {
         System.out.print(e);
         }**/
    }

}


