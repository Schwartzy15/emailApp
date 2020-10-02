package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 12;
    private String alternateEmail;
    private String companySuffix = "company.com";

    //Constructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName/*class variable*/ = firstName/*local variable*/;
        this.lastName = lastName;
        //System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        //Call method asking for the department; return the department
        this.department = setDepartment();
        //System.out.println("Department: "+ this.department);

        //Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("PASSWORD: " + this.password);

        //Combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
        //System.out.println("Email: " + email);

    }

    //Ask for department
    private String setDepartment() {
        System.out.println("Hello " + firstName.toUpperCase() + ". Please select your department below.");
        System.out.print("DEPARTMENT CODES:\n1: Sales \n2: Development\n3: Accounting " +
                "\n0: for None\nEnter Department Code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        switch (depChoice) {
            case 1:
                return "sales.";
            case 2:
                return "dev.";
            case 3:
                return "acc.";
            default:
                return "";
        }
    }

    //Generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;//Encapsulation -- hiding properties
    }

    //Set the alternate email
    public void setAlternateEMail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    //Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "MB";
    }

}