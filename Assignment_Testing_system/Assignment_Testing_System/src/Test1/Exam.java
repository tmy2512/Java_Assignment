package Test1;

import Test1.Account;
import Test1.CategoryQuestion;

import java.util.Date;

public class Exam {
    private int id;
    private String code;
    private String title;
    private CategoryQuestion categoryQuestion;
    private int duration;
    private Account account;
    private Date creataDate;
    private Question[] questions;

    public Exam() {
    }

    public Exam(int id, String code, String title, CategoryQuestion categoryQuestion, int duration, Account account, Date creataDate, Question[] questions) {
        this.id = id;
        this.code = code;
        this.title = title;
        this.categoryQuestion = categoryQuestion;
        this.duration = duration;
        this.account = account;
        this.creataDate = creataDate;
        this.questions = questions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CategoryQuestion getCategoryQuestion() {
        return categoryQuestion;
    }

    public void setCategoryQuestion(CategoryQuestion categoryQuestion) {
        this.categoryQuestion = categoryQuestion;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getCreataDate() {
        return creataDate;
    }

    public void setCreataDate(Date creataDate) {
        this.creataDate = creataDate;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
}