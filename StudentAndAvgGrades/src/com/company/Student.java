package com.company;

public class Student {
    private String name;

    public void setSurname  (String surname) throws Exception {
        if (surname.isEmpty()){
            throw new Exception("Surname cant be empty");
        }
        if (surname.length()<3){
            throw new Exception("Too short");
        }
        this.surname = surname;
    }

    private String surname;
    private int [] grades;

    public Student(String name, String surname){
        this.name=name;
        this.surname=surname;

    }

    public Student (String name, String surname, int[]grades){
        this(name, surname);
        this.grades=grades;
    }


    public String getName() { return name;
    }


    public String getSurname() { return surname;
    }


    public int[] getGrades() { return grades;
    }


    public double getAverageGrade(){

        if (grades.length==0) {
            return 0d;
        }

        double sum = 0;
        for (int grade: grades){
            sum +=  grade;
        }

        return (sum/grades.length);

    }

}
