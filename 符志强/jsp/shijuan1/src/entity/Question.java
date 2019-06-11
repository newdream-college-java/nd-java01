package entity;

public class Question {
    private int  qId;
    private String question;
    private String questionA;
    private String questionB;
    private String questionC;
    private String questionD;
    private int subject;
    private String answer;
    public int getqId() {
        return qId;
    }
    public void setqId(int qId) {
        this.qId = qId;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getQuestionA() {
        return questionA;
    }
    public void setQuestionA(String questionA) {
        this.questionA = questionA;
    }
    public String getQuestionB() {
        return questionB;
    }
    public void setQuestionB(String questionB) {
        this.questionB = questionB;
    }
    public String getQuestionC() {
        return questionC;
    }
    public void setQuestionC(String questionC) {
        this.questionC = questionC;
    }
    public String getQuestionD() {
        return questionD;
    }
    public void setQuestionD(String questionD) {
        this.questionD = questionD;
    }
    public int getSubject() {
        return subject;
    }
    public void setSubject(int subject) {
        this.subject = subject;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    @Override
    public String toString() {
        return "Question [qId=" + qId + ", question=" + question + ", questionA=" + questionA + ", questionB="
                + questionB + ", questionC=" + questionC + ", questionD=" + questionD + ", subject=" + subject
                + ", answer=" + answer + "]\n";
    }
  
    
    
}
