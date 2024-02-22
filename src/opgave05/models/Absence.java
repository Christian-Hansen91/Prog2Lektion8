package opgave05.models;

import java.awt.desktop.PrintFilesEvent;

public class Absence {
    private int[][] absenceSchema;

    public Absence(int[][] absenceSchema) {
        this.absenceSchema = absenceSchema;
    }

    public void print() {
        System.out.print("Elev\\Måned");
        for (int i = 0; i < absenceSchema[0].length; i++) {
            System.out.printf("%3d", (i + 1));
        }
        System.out.println();
        for (int elev = 0; elev < absenceSchema.length; elev++) {
            System.out.printf("%-10d", (elev + 1));
            for (int month = 0; month < absenceSchema[elev].length; month++) {
                System.out.printf("%3d", absenceSchema[elev][month]);
            }
            System.out.println();
        }
    }

    public int totalAbsence(int studentNumber) {
        int totalAbsence = 0;
        for (int i : absenceSchema[studentNumber - 1]) {
            totalAbsence += i;
        }
        return totalAbsence;
    }

    public double average(int studentNumber) {
        int totalAbsence = totalAbsence(studentNumber);
        return (double) totalAbsence / (double) absenceSchema[studentNumber].length;
    }

    public int StudentsWithoutAbsence() {
        int zeroAbsenceCount = 0;
        for (int elev = 1; elev < absenceSchema.length; elev++) {
            if (totalAbsence(elev) == 0) {
                zeroAbsenceCount++;
            }
        }

        return zeroAbsenceCount;
    }

    public int mostAbsence() {
        int highestAbsenceStudent = 1;
        int highestAbsenceCount = totalAbsence(1);
        for (int elev = 2; elev < absenceSchema.length; elev++) {
            if (totalAbsence(elev) > highestAbsenceCount) {
                highestAbsenceStudent = elev;
            }
        }
        return highestAbsenceStudent;
    }

    public void reset(int studentNumber) {
        for (int month = 0; month < absenceSchema[studentNumber - 1].length; month++) {
            absenceSchema[studentNumber - 1][month] = 0;
        }
    }
}
