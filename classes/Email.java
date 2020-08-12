package br.com.praticas.Pratica1Aula55.classes;


import java.util.Random;
import java.util.Scanner;

public class Email {
    private String email;
    private String firstname;
    private String lastname;
    private String department;
    private static String company = "companytest.com";
    private String password;
    private static double mailboxCap = 500;


    public Email(String firstname, String lastname) {
        System.out.println("---------------------------------------------");
        this.firstname = firstname;
        this.lastname = lastname;
        setDepartment();
        genPassword();
        this.email = this.firstname.toLowerCase() + "." + this.lastname.toLowerCase() + "@" + Email.company;
    }

    private void setDepartment() {
        Scanner scanObj = new Scanner(System.in);
        System.out.println("Please, " + this.firstname + " select your department: \n1: Sales \n2: Development \n3: Accounting");
        System.out.print("Enter your code: ");
        byte selectDep = scanObj.nextByte();

        switch (selectDep) {
            case 1:
                this.department = "Sales";
                break;
            case 2:
                this.department = "Development";
                break;
            case 3:
                this.department = "Accounting";
                break;
            default:
                this.department = "";
        }

    }

    private String genPassword() {
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@.-";
        char[] arrPassword = new char[8]; //char array
        System.out.println(arrPassword[0]);

        for (int i = 0; i < arrPassword.length; i++) {
            Random random = new Random();
            int randomNumb = random.nextInt(setPassword.length()); // generates a number between 0 and 38

            arrPassword[i] = setPassword.charAt(randomNumb);
        }

        String passwordString = new String(arrPassword);
        return this.password = passwordString.toLowerCase();

    }

    public void showInfo(){
        System.out.println("---------------------------------------------");
        System.out.println("Your password was automatically generated!");
        System.out.println("Your name: " + this.firstname + " " + this.lastname);
        System.out.println("Your department: " + this.department);
        System.out.println("Your email: " + this.email);
        System.out.println("Mailbox capacity: " + Email.mailboxCap + " MB");
        System.out.println("---------------------------------------------");
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public static double getMailboxCap() {
        return mailboxCap;
    }

    public static void setMailboxCap(double mailboxCap) {
        Email.mailboxCap = mailboxCap;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Email.company = company;
    }

    public String getPassword() {
        return "Your password: " + password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
