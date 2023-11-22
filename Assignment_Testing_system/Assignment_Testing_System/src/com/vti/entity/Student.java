package com.vti.entity;

public abstract class Student {
    private int id;
    private String name;
    private String homeTown;
    private float mark;
    public Student() {}

    public abstract void choi();

    public Student( String name, String homeTown) {
        this.name = name;
        this.homeTown = homeTown;
        this.mark = 0;
    }
    public float addMark(float mark2) {
        return this.mark + mark2;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        if(mark < 4.0 ) {
            return "Student{" +
                    ", name='" + name + '\'' +
                    ", homeTown='" + homeTown + '\'' +
                    ", mark=" + "Yeu" +
                    '}';
        }
        else if (mark > 4.0 && mark < 6.0) {
            return "Student{" +
                    ", name='" + name + '\'' +
                    ", homeTown='" + homeTown + '\'' +
                    ", mark=" + "Trung binh" +
                    '}';
        }
        else if (mark > 6.0 && mark < 8.0) {
            return "Student{" +
                    ", name='" + name + '\'' +
                    ", homeTown='" + homeTown + '\'' +
                    ", mark=" + "kha" +
                    '}';
        } else if (mark > 8.0) {
            return "Student{" +
                    ", name='" + name + '\'' +
                    ", homeTown='" + homeTown + '\'' +
                    ", mark=" + "Gioi" +
                    '}';
        }

        return null;
    }
}
