package com.ankush.myapplication;

public class add_attendance {
    String Timming,Branch,Subject,Date;
    int Reg_no,Attendance;

    public add_attendance(int reg_no,String branch,String subject,String timming,int attendance){


        this.Reg_no = reg_no;
        this.Branch = branch;
        this.Subject = subject;
        this.Timming=timming;
        this.Attendance=attendance;


    }
    public add_attendance(){

    }

    public int getAttendance() {
        return Attendance;
    }

    public void setAttendance(int attendance) {
        Attendance = attendance;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getBranch() {
        return Branch;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getTimming() {
        return Timming;
    }

    public void setTimming(String timming) {
        Timming = timming;
    }

    public int getReg_no() {
        return Reg_no;
    }

    public void setReg_no(int reg_no) {
        Reg_no = reg_no;
    }
}
