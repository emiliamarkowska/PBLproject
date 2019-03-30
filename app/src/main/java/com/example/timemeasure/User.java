package com.example.timemeasure;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


    public class User {
        // komentarz
        private int ID;
        private int age;
        private String studentOrWorker;
        private String date;
        private double timeAtSchool;
        private double timeOnHobby;
        private double timeOnTravel;


        public User(int age, double timeAtSchool, double timeOnHobby, double timeOnTravel)
        {
            this.ID = 0;
            this.age = age;
            this.timeAtSchool = timeAtSchool;
            this.timeOnHobby = timeOnHobby;
            this.timeOnTravel = timeOnTravel;

            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();

            this.date = dateFormat.format(date);
        }

        public int getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        public String getStudentOrWorker() {
            return studentOrWorker;
        }

        public String getDate() {
            return date;
        }

        public double getTimeAtSchool() {
            return timeAtSchool;
        }

        public double getTimeOnHobby() {
            return timeOnHobby;
        }

        public double getTimeOnTravel() {
            return timeOnTravel;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setStudentOrWorker(String studentOrWorker) {
            this.studentOrWorker = studentOrWorker;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public void setTimeAtSchool(double timeAtSchool) {
            this.timeAtSchool = timeAtSchool;
        }

        public void setTimeOnHobby(double timeOnHobby) {
            this.timeOnHobby = timeOnHobby;
        }

        public void setTimeOnTravel(double timeOnTravel) {
            this.timeOnTravel = timeOnTravel;
        }
    }

