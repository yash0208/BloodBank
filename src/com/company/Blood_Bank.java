package com.company;

import java.util.Scanner;
interface if1 {
    public void blood_donardata();
    public void blood_receiverdata();
}
class Blood_Bank extends PersonalDetails implements if1 {
     int countAp;
     int countOp ;
     int countBp;
     int countABp;
     int countAn;
     int countOn;
     int countBn;
     int countABn;
    public Blood_Bank()
    { }
    public Blood_Bank(int countAp1 , int countOp1 , int countBp1 , int countABp1 , int countAn1 , int countOn1 , int countBn1 , int countABn1)
    {
        countAp=countAp1;
        countOp=countOp1;
        countBp=countBp1;
        countABp=countABp1;
        countAn=countAn1;
        countOn=countOn1;
        countBn=countBn1;
        countABn=countABn1;
    }
    public void count(String Blood){
        if ("A+".equals(Blood)) {
            countAp = countAp + 1;
            System.out.println("We have  now " + countAp + " unit of  A+ blood  available with us.");
        } else if ("O+".equals(Blood)) {
            countOp = countOp + 1;
            System.out.println("We have now  " + countOp + " unit of  O+ blood  available with us. ");
        } else if ("B+".equals(Blood)) {
            countBp = countBp + 1;
            System.out.println("We have now  " + countBp + " unit of  B+ blood  available with us.");
        } else if ("AB+".equals(Blood)) {
            countABp = countABp + 1;
            System.out.println("We have now " + countABp + " unit of  AB+ blood  available with us. ");
        } else if ("A-".equals(Blood)) {
            countAn = countAn + 1;
            System.out.println("We have now " + countAn + " unit of  A- blood  available with us.");
        } else if ("O-".equals(Blood)) {
            countOn = countOn + 1;
            System.out.println("We have now " + countOn + " unit of  O- blood  available with us.  ");
        } else if ("B-".equals(Blood)) {
            countBn = countBn + 1;
            System.out.println("We have now " + countBn + " unit of  B- blood  available with us. ");
        } else if ("AB-".equals(Blood)) {
            countABn = countABn + 1;
            System.out.println("We have now " + countABn + "unit of  AB- blood  available with us.  ");
        }
    }
    @Override
    public void blood_donardata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thank you for donating blood! \nRemember to eat a healthy meal  and drink plenty of fluids. \nYou can continue your normal routine, but avoid heavy lifting and strenuous exercise for 12 hours.");
    }

    @Override
    public void blood_receiverdata() {
        Scanner sc = new Scanner(System.in);
        int unitBlood;
        int bloodType;
        System.out.println("How much units of blood do you need?");
        unitBlood = sc.nextInt();
        if ("A+".equals(BloodGroup)) {
            System.out.println("You can receive blood  from 1)A+   2)A-   3)O+    4)O-" +"\n Please enter your choice:");
            bloodType = sc.nextInt();
            switch (bloodType) {
                case 1:
                    if (countAp != 0) {
                        countAp = countAp - unitBlood;
                        System.out.println(" Now A+ has " + countAp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 2:
                    if (countAn != 0) {
                        countAn = countAn - unitBlood;
                        System.out.println(" NowA- has " + countAn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 3:
                    if (countOp != 0) {
                        countOp = countOp - unitBlood;
                        System.out.println("Now O+ has " + countOp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 4:
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("O+".equals(BloodGroup)) {
            System.out.println("You can receive blood  from  1)O+    2)O-" +"\n Please enter your choice:");
            bloodType = sc.nextInt();
            switch (bloodType) {
                case 1:
                    if (countOp != 0) {
                        countOp = countOp - unitBlood;
                        System.out.println("Now O+ has " + countOp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 2:
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("B+".equals(BloodGroup)) {
            System.out.println("You can receive blood  from 1)B+   2)B-   3)O+    4)O-" +"\n Please enter your choice:");
            bloodType = sc.nextInt();
            switch (bloodType) {
                case 1:
                    if (countBp != 0) {
                        countBp = countBp - unitBlood;
                        System.out.println("Now B+ has " + countBp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 2:
                    if (countBn != 0) {
                        countBn = countBn - unitBlood;
                        System.out.println("Now B- has " + countBn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 3:
                    if (countOp != 0) {
                        countOp = countOp - unitBlood;
                        System.out.println("Now O+ has " + countOp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 4:
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("AB+".equals(BloodGroup)) {
            System.out.println("You can receive blood  from   1)A+    2)A-    3)O+    4)O-    5)B+    6)B-    7)AB+   8)AB-" +"\n Please enter your choice:");
            bloodType = sc.nextInt();
            switch (bloodType) {
                case 1:
                    if (countAp != 0) {
                        countAp = countAp - unitBlood;
                        System.out.println("Now A+ has " + countAp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 2:
                    if (countAn != 0) {
                        countAn = countAn - unitBlood;
                        System.out.println("Now A- has " + countAn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 3:
                    if (countOp != 0) {
                        countOp = countOp - unitBlood;
                        System.out.println("Now O+ has " + countOp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 4:
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 5:
                    if (countBp != 0) {
                        countBp = countBp - unitBlood;
                        System.out.println("Now B+ has " + countBp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 6:
                    if (countBn != 0) {
                        countBn = countBn - unitBlood;
                        System.out.println("Now B- has " + countBn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 7:
                    if (countABp != 0) {
                        countABp = countABp - unitBlood;
                        System.out.println("Now AB+ has " + countABp + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 8:
                    if (countABn != 0) {
                        countABn = countABn - unitBlood;
                        System.out.println("Now AB- has " + countABn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("A-".equals(BloodGroup)) {
            System.out.println("You can receive blood  from  1)A-    2)O-" +"\n Please enter your choice:");
            bloodType = sc.nextInt();
            switch (bloodType) {
                case 1:
                    if (countAn != 0) {
                        countAn = countAn - unitBlood;
                        System.out.println("Now A- has " + countAn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 2:
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("O-".equals(BloodGroup)) {
            System.out.println("You can receive blood  from   O- ");
            if (countAn != 0) {
                countAn = countAn - unitBlood;
                System.out.println("Now A- has " + countAn + " units of blood ");
            } else {
                System.out.println("Sorry! It is not available with us right now .");
            }
        }else if ("B-".equals(BloodGroup)) {
            System.out.println("You can receive blood  from  1)B-    2)O-" +"\n Please enter your choice:");
            bloodType = sc.nextInt();
            switch (bloodType) {
                case 1:
                    if (countBn != 0) {
                        countBn = countBn - unitBlood;
                        System.out.println("Now B- has " + countBn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 2:
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        } else if ("AB-".equals(BloodGroup)) {
            System.out.println("You can receive blood  from   1)A-   2)O-   3)B-   4)AB-" +"\n Please enter your choice:");
            bloodType = sc.nextInt();
            switch (bloodType) {
                case 1:
                    if (countAn != 0) {
                        countAn = countAn - unitBlood;
                        System.out.println("Now A- has " + countAn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 2:
                    if (countOn != 0) {
                        countOn = countOn - unitBlood;
                        System.out.println("Now O- has " + countOn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 3:
                    if (countBn != 0) {
                        countBn = countBn - unitBlood;
                        System.out.println("Now B- has " + countBn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                case 4:
                    if (countABn != 0) {
                        countABn = countABn - unitBlood;
                        System.out.println("Now AB- has " + countABn + " units of blood ");
                    } else {
                        System.out.println("Sorry! It is not available with us right now .");
                    }
                    break;
                default: //wrong number pressed
                    System.out.println("\n \u274C" + " Please enter valid choice " + "\u274C\n");
                    break;
            }
        }
    }
}
