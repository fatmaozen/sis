public class Main {
    public static void main(String[] args) {
        Course math = new Course("Matematik", "MAT101", "MAT");
        Course phys = new Course("Fizik", "FZK101", "FZK");
        Course chem = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        math.addTeacher(t1);
        math.printTeacher();
        phys.addTeacher(t2);
        phys.printTeacher();
        chem.addTeacher(t3);
        chem.printTeacher();

        Student s1 = new Student("İnek Şaban", "140144015", 4, math, phys, chem);
        s1.addBulkExamNote(50, 20, 40);
        s1.addBulkVerbalNote(100, 90, 86);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "2211133", 4, math, phys, chem);
        s2.addBulkExamNote(100, 50, 40);
        s1.addBulkVerbalNote(100, 90, 86);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "221121312", 4, math, phys, chem);
        s3.addBulkExamNote(50, 20, 40);
        s1.addBulkVerbalNote(100, 90, 86);
        s3.isPass();

    }
}
