public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNote;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            /*System.out.println(teacher.name + " başarılı bir şekilde derse atandı.");*/
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor !");
        }
    }

    void printTeacher() {
        teacher.print();
    }
}
