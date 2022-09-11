package homework9;

/**
 * Project Admin -> Husanboy Azamov
 * Package Name  -> homework9
 * Class Name -> Main
 * Copyright © : 9/8/2022
 */
public class  Main{
    public static void main(String[] args) {
        Test test=new Test(4);
        Question question1=new Question("Savol","a","b","c","d","a");
        Question question2=new Question("Savol2","a","b","c","d","b");
        Question question3=new Question("Savol3","a","b","c","d","c");
        Question question4=new Question("Savol4","a","b","c","d","d");
        Question question5=new Question("Savol5","a","b","c","d","a");
        assertEquals(test.isEmpty(),true);
        assertEquals(test.isFull(),false);
        assertEquals(test.addQuestion(question1),true);
        assertEquals(test.addQuestion(question2),true);
        assertEquals(test.addQuestion(question3),true);
        assertEquals(test.addQuestion(question4),true);
        assertEquals(test.addQuestion(question5),false);
        assertEquals(test.start(),true);
        assertEquals(test.isFull(),true);
        assertEquals(test.getQuestion(),"Savol4");
        assertEquals(test.check("a"),true);
        assertEquals(test.check("b"),true);
        assertEquals(test.check("a"),true);
        assertEquals(test.check("d"),true);
    }
    public static void assertEquals(Object result, Object expected) {
        if (!result.equals(expected)) {
            throw new IllegalArgumentException("Kutilgan natija: " + expected + " Sizning natijangiz:" + result);
        }
    }
}
class Test {
    private int countChecking;
    private Result result;
    private int maximal;
    private Question[] questionArray;
    private int countArray;
    private boolean testStarted;
    public Test(int maximal) {
        this.maximal = maximal;
        questionArray= new Question[maximal];
        result=new Result();
    }
    public boolean addQuestion(Question _question){
        if (isFull())return false;
        questionArray[countArray++]=_question;
        return true;
    }
    public boolean isEmpty(){
        return countArray==0;
    }
    public boolean isFull(){
        return countArray==maximal;
    }
    public boolean start(){
        if (isEmpty()||testStarted)return false;
        testStarted=true;
        return testStarted;
    }
    public Result finish(){
        if (testStarted)testStarted=false;
        return result;
    }
    public boolean check(String checkAnswer){
        if (testStarted && countChecking < countArray ){
            if (checkAnswer.equals(questionArray[countChecking++].getCorrectAnswer())){
                result.setCorrectCount(result.getCorrectCount()+1);
                result.setCount(result.getCount()+1);
            }else {
                result.setWrongCount(result.getWrongCount()+1);
                result.setCount(result.getCount()+1);
            }
            return true;
        }
        return false;
    }
    public String getQuestion(){
        if (isEmpty())return "Not Question ";
        return questionArray[countArray-1].getQuestionSpeech();
    }
    public int getPosition(){
        return  countArray;
    }
}
class Result {
    private int count;//set=>5->  5<-3<-getni kirtish
    private int wrongCount;
    private  int correctCount;


    public int getCount() {
        return count;
    }
    public int getWrongCount() {
        return wrongCount;
    }
    public int getCorrectCount() {
        return correctCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setWrongCount(int wrongCount) {
        this.wrongCount = wrongCount;
    }

    public void setCorrectCount(int correctCount) {
        this.correctCount = correctCount;
    }

    @Override
    public String toString() {
        return "Natijaxon{" + "count=" + count + ", wrongCount=" + wrongCount + ", correctCount=" + correctCount + '}';
    }
}
class Question {
    private String questionSpeech;
    private String answer1;
    private String answer2;
    private String answer3;
    private String answer4;
    private String correctAnswer;

    public Question(String questionSpeech, String answer1, String answer2, String answer3, String answer4, String correctAnswer) {
        this.questionSpeech = questionSpeech;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
    }
    public String getQuestionSpeech() {
        return questionSpeech;
    }
    public String getAnswer1() {
        return answer1;
    }
    public String getAnswer2() {
        return answer2;
    }
    public String getAnswer3() {
        return answer3;
    }
    public String getAnswer4() {
        return answer4;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
