package com.expertzlab.examples;


public class Questions {


    String id;
    String quest_name;
    int marks;
    String answers;

    public Questions(String id, String quest_name, int marks, String answers) {
        this.id = id;
        this.quest_name = quest_name;
        this.marks = marks;
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "id='" + id + '\'' +
                ", quest_name='" + quest_name + '\'' +
                ", marks=" + marks +
                ", answers='" + answers + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Questions)) return false;

        Questions questions = (Questions) o;

        if (marks != questions.marks) return false;
        if (!id.equals(questions.id)) return false;
        if (!quest_name.equals(questions.quest_name)) return false;
        return answers.equals(questions.answers);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + quest_name.hashCode();
        result = 31 * result + marks;
        result = 31 * result + answers.hashCode();
        return result;
    }

}
