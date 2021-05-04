package com.company;

import java.util.*;
//import java_project.Blood_Bank;
//import java_project.Health_Issues.Blood_Bank;
///for Personal detail

class PersonalDetails {

    int age, Cno, Ano;
    String contactNo = Integer.toString(Cno);
    String aadhaarNo = Integer.toString(Ano);
    float weight;
    String name, BloodGroup, email_id;

    //Method for Thread
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }
//Method to get data from user

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Full Name : ");
        name = sc.nextLine();
        System.out.println("Enter your Age : ");
        age = sc.nextInt();
        System.out.println("Enter your Contact Number:");
        sc.nextLine();
        do {
            try {
                contactNo = sc.nextLine();
                if (String.valueOf(contactNo).length() != 10) {
                    throw new ArrayIndexOutOfBoundsException("\u274CInvalid  \nYour Contact number  must contain 10 digits\nTry Again \nEnter the contact number");
                }
            } catch (ArrayIndexOutOfBoundsException aiob) {
                System.out.println(aiob);
            }
        } while (String.valueOf(contactNo).length() != 10);
        System.out.println("Enter your Aadhaar Number:");
        do {
            try {
                aadhaarNo = sc.nextLine();
                if (String.valueOf(aadhaarNo).length() != 12) {
                    throw new ArrayIndexOutOfBoundsException(" \u274CInvalid  \nYour Aadhaar number must contain  12 digits\nTry Again \nEnter the aadhaar number");
                }
            } catch (ArrayIndexOutOfBoundsException aiob) {
                System.out.println(aiob);
            }
        } while (String.valueOf(aadhaarNo).length() != 12);
        System.out.println("Enter your Email'id:");
        email_id = sc.nextLine();
        System.out.println("Enter your Blood Group:");
        BloodGroup = sc.nextLine();
        System.out.println("Enter your Weight in kg's : ");
        weight = sc.nextFloat();
    }
//Method to show data

    void showData() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Contact Number : " + contactNo);
        System.out.println("Aadhaar number  : " + aadhaarNo);
        System.out.println("Email id : " + email_id);
        System.out.println("Blood Group : " + BloodGroup);
        System.out.println("Weight:" + weight + "kg");
    }
}
//blood unit for count of units for every blood type  inherited from personal detail
abstract class HealthIssue extends PersonalDetails {

    //int i;
    abstract void healthIssue();
}

class Health_Issues extends HealthIssue {

    static int i;
    Scanner sc = new Scanner(System.in);
    int n;
    String p;

    @Override
    public void healthIssue() {
        System.out.println("\n********\n");
        System.out.println("Following Health Issues should not be there");
        System.out.println("=>Time period between successive blood donation should be more than 3 months");
        System.out.println("=>ear/body piercing or Tattoo : 6 months");
        System.out.println("=>Surgeries : 1 month ");
        System.out.println("=>Alcohol : 24 hour");
        System.out.println("=>Pregnant");
        System.out.println("=>Miscarriage in past 6 months");
        System.out.println("=>Asthma with active symptoms");
        System.out.println("=>Any disorder in the past");
        System.out.println("=>Covid ");
        System.out.println("\n********\n");
        healthIssue(i);
    }

    public void healthIssue(int x) {
        System.out.println("Do  you have any of these problems?? ");
        System.out.println("1.Yes");
        System.out.println("2.No");
        System.out.println("Enter your choice : ");
        i = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("Sorry! you cannot donate Blood.");
                break;
            case 2:
                System.out.println("Any other health issue you would like to mention???");
                System.out.println("1.Yes");
                System.out.println("2.No");
                System.out.println("Enter your choice : ");
                n = sc.nextInt();

                switch (n) {
                    case 1:
                        System.out.println("Please mention it here:");
                        sc.nextLine();
                        p = sc.nextLine();
                        break;
                    case 2:
                        System.out.println("Thank you! You can continue.");
                        break;
                    default: //wrong number pressed
                        System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                        break;

                }
                break;
            default: //wrong number pressed
                System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                break;
        }
    }
}

class Blood extends Blood_Bank {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //Blood_Bank units = new Blood_Bank();
        Blood_Bank unit = new Blood_Bank(10, 15, 19, 20, 10, 20, 17, 12);
        Blood b = new Blood();
        int age, weight, choice;
        System.out.println("\n*Please enter your personal details*");
        b.getData();
        HealthIssue h = new Health_Issues();
        h.healthIssue();

        PersonalDetails r = new PersonalDetails();
        System.out.println("..........................Processing please wait....................................");
        r.run();
        if (Health_Issues.i == 1) {
            System.out.println("Thank you for visiting us!");
        } else {
            do {

                System.out.println("****************************");
                System.out.println("Please enter your choice:");
                System.out.println("1. Donate Blood");
                System.out.println("2. Receive Blood");
                System.out.println("3. Show your data");
                System.out.println("4. To exit");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        if (b.age < 17 || b.age > 66) {
                            throw new ArithmeticException("Your age must be between 18 to 65 to donate blood.");
                        } else if (b.weight < 40) {
                            throw new ArrayIndexOutOfBoundsException("Your weight must be greater than 50 kg to donate blood.");
                        } else {
                            unit.blood_donardata();
                            unit.count(b.BloodGroup);
                        }
                        break;
                    case 2:
                        unit.blood_receiverdata();
                        break;
                    case 3:
                        System.out.println("Your Details are:");
                        b.showData();
                        break;
                    case 4: //Exit
                        System.out.println("Thank you for visiting us!");
                        break;
                    default: //wrong number pressed
                        System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                        break;
                }
            } while (choice != 4);
        }
    }
}