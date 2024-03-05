package homework10.studentLesson;

import org.jetbrains.annotations.NotNull;

public class Main {

    public static void main(String[] args) {

         Limit l = new Limit(20);
         Lesson lesson = new Lesson("Algebra", 10);
         Student s1 = new Student("Husanboy",16,l);
         System.out.println(s1.addLesson(lesson));
         System.out.println(s1.isFullLesson());
         s1.getLesson();
         s1.getInfo();

    }
    public static void assertEquals(Object result, Object expected) {
        if (!result.equals(expected)) {
            throw new IllegalArgumentException("Kutilgan natija: " + expected + " Sizning natijangiz:" + result);
        }
    }
}

class Lesson{
    private String lessons;
    private int hourWeek;

    public Lesson(String lessons, int hourWeek) {
        this.lessons = lessons;
        this.hourWeek = hourWeek;
    }

    public String getLessons() {
        return lessons;
    }

    public int getHourWeek() {
        return hourWeek;
    }
}
class Student{
    private String studentName;
    private int age;
    private Limit limit;
    private int currentLessons;
    private int currentLimit;
    private Lesson[] lessons;

    public Student(String studentName, int age, @NotNull Limit limit) {
        this.studentName = studentName;
        this.age = age;
        this.limit = limit;
        this.lessons = new Lesson[16];
        this.currentLimit = limit.getLimit();
    }

    public boolean addLesson(Lesson lesson){
        if(currentLessons == lessons.length){
            lessons = resize(lessons);
        }
        if(currentLimit - lesson.getHourWeek() >= 0 && checkLessonNotExists(lesson)){
            lessons[currentLessons++] = lesson;
            currentLimit -= lesson.getHourWeek();
            return true;
        }
        return false;
    }

    public boolean isFullLesson(){
        return currentLimit == 0;
    }
    public void getLesson(){
        for (int i = 0; i < currentLessons; i++) {
            System.out.println("Dars nomi: " + lessons[i].getLessons() + " |==| " + "Soati: " + lessons[i].getHourWeek());
        }
    }
    public int getLimit(){
        return currentLimit;
    }
    public void getInfo(){
        System.out.println("Name: " + studentName + " |==| " + "Age: "+age + " |==| " + "Lesson_and_Student.Limit: " + currentLimit + "/" + limit.getLimit());
    }
    private Lesson[] resize(Lesson[] lessons){
        Lesson[] new_lessons = new Lesson[lessons.length + lessons.length / 2];
        for (int i = 0; i < lessons.length; i++) {
            new_lessons[i] = lessons[i];
        }
        return new_lessons;
    }
    private boolean checkLessonNotExists(Lesson lesson){
        for (int i = 0; i < currentLessons; i++) {
            if(lesson.getHourWeek() == lessons[i].getHourWeek() && lesson.getLessons().equals(lessons[i].getLessons()))
                return false;
        }
        return true;
    }
}

class Limit{
    private int limit;

    public Limit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }
}
