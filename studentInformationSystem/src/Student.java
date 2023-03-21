public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    double generalAverage;
    boolean isPass = false;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
    }

    void addBulkExamNote(int note1, int note2, int note3, int sozluNote1, int sozluNote2, int sozluNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (sozluNote1 >= 0 && sozluNote1 <= 100) {
            this.c1.sozluNote = sozluNote1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (sozluNote2 >= 0 && sozluNote2 <= 100) {
            this.c2.sozluNote = sozluNote2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (sozluNote3 >= 0 && sozluNote3 <= 100) {
            this.c3.sozluNote = sozluNote3;
        }
    }

    void isPass() {
        System.out.println("=============================");
        this.average = ((this.c1.note + this.c2.note + this.c3.note) / 3.0);
        if (this.average > 55) {
            System.out.println("Hababam sınıfı uyanıyor !");
            this.isPass = true;
        } else {
            System.out.println("Hababm sınıfı, sınıfta kaldı !");
            this.isPass = false;
        }
    }

    void printNote() {
        System.out.println(c1.name + " Notu\t:" + c1.note);
        System.out.println(c1.name + " Sözlü Notu\t:" + c1.sozluNote);
        System.out.println(c2.name + " Notu\t:" + c2.note);
        System.out.println(c2.name + " Sözlü Notu\t:" + c2.sozluNote);
        System.out.println(c3.name + " Notu\t:" + c3.note);
        System.out.println(c3.name + " Sözlü Notu\t:" + c3.sozluNote);

        calculateAverage();
        System.out.println("Ortalamanız\t: " + this.generalAverage);
    }

    void calculateAverage() {
        double examAverage = (c1.note + c2.note + c3.note) / 3.0;
        double sozluAverage = (c1.sozluNote + c2.sozluNote + c3.sozluNote) / 3.0;
        double generalAverage = (examAverage * 0.8) + (sozluAverage * 0.2);
        this.generalAverage = generalAverage;
    }
}
