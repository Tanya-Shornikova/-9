package com.company.Univer;

import java.util.Objects;

public class University {
    private String name;
    private Integer studentCont;
    private Integer PrepodCont;
    private Integer egeCont;

    public University(String name, Integer studentCont, Integer prepodCont, Integer egeCont) {
        this.name = name;
        this.studentCont = studentCont;
        PrepodCont = prepodCont;
        this.egeCont = egeCont;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        University that = (University) o;
        return Objects.equals(name, that.name) && Objects.equals(studentCont, that.studentCont) && Objects.equals(PrepodCont, that.PrepodCont) && Objects.equals(egeCont, that.egeCont);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentCont, PrepodCont, egeCont);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentCont() {
        return studentCont;
    }

    public void setStudentCont(Integer studentCont) {
        this.studentCont = studentCont;
    }

    public Integer getPrepodCont() {
        return PrepodCont;
    }

    public void setPrepodCont(Integer prepodCont) {
        PrepodCont = prepodCont;
    }

    public Integer getEgeCont() {
        return egeCont;
    }

    public void setEgeCont(Integer egeCont) {
        this.egeCont = egeCont;
    }

    @Override
    public String toString() {
        return "{Название вуза: " + "'" + name + "'" +
                "; Сколько всего студентов: " + studentCont +
                "; Сколько всего преподов: " + PrepodCont +
                "; Средний бал Еге: " + egeCont + "}";
    }
}
