public class Student {
    String name, stuNo;
    int classes;
    Course math;
    Course phys;
    Course chem;
    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course math, Course phys, Course chem) {
        this.name = name;
        this.stuNo = stuNo;
        this.math = math;
        this.phys = phys;
        this.chem = chem;
        this.classes = classes;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int math, int phys, int chem) {
        if (math >= 0 && math <= 100)
            this.math.note = math;

        if (phys >= 0 && phys <= 100)
            this.phys.note = phys;

        if (chem >= 0 && chem <= 100)
            this.chem.note = chem;

    }

    public void addBulkVerbalNote(int mathVerbal, int physVerbal, int chemVerbal) {
        if (mathVerbal >= 0 && mathVerbal <= 100)
            this.math.verbalNote = mathVerbal;


        if (physVerbal >= 0 && physVerbal <= 100)
            this.phys.verbalNote = physVerbal;


        if (chemVerbal >= 0 && chemVerbal <= 100)
            this.chem.verbalNote = chemVerbal;

    }

    public void isPass() {
        if (this.chem.note == 0 || this.phys.note == 0 || this.math.note == 0) {
            System.out.println("Notlar tam girilmemiş.");
        } else {
            printNote();
            this.isPass = checkPass();
            System.out.println("Ortalama: " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfı geçemedi.");
            }
        }

    }


    public void calcAvarage() {
        double mathAvarage = this.math.note * (0.70) + this.math.verbalNote * (0.3);
        double physAvarage = this.phys.note * (0.75) + this.phys.verbalNote * (0.25);
        double chemAvarage = this.chem.note * (0.60) + this.chem.verbalNote * (0.40);
        this.avarage = (mathAvarage + physAvarage + chemAvarage) / 3;
    }

    public void printNote() {
        System.out.println("********************");
        System.out.println("Öğrenci Adı: " + this.name);
        System.out.println("Matematik sınav notu: " + this.math.note + "\nMatematik sözlü notu: " + this.math.verbalNote);
        System.out.println("Fizik sınav notu: " + this.phys.note + "\nFizik sözlü notu: " + this.phys.verbalNote);
        System.out.println("Kimya sınav notu: " + this.chem.note + "\nKimya sözlü notu: " + this.chem.verbalNote);
    }

    public boolean checkPass() {
        calcAvarage();
        return this.avarage > 55;
    }


}
