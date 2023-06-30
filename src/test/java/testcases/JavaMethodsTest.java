package testcases;

import org.testng.annotations.Test;

public class JavaMethodsTest {

    //Task 1
    @Test
    public void testJavaMethods(){

        //Please
        int income = 10277;

        String condition1 = "your tax will be 10%";
        String condition2 = "your tax will be 12%";
        String condition3 = "your tax will be 22%";
        String condition4 = "please call your CPA";

        if (income >=0 && income<=10275){
            System.out.println(condition1);
        }
        else if (income >=10276 && income<=41775) {
            System.out.println(condition2);
        }
        else if (income >=41776 && income<=89075) {
            System.out.println(condition3);
        }
        else {
            System.out.println(condition4);
        }
    }
    //Task 2
    @Test
    public void testSwitch(){

        String department = "sales";
        switch (department){
            case "sales":
                System.out.println("Sales department works from 8am to 12pm.");
                break;
            case "operations":
                System.out.println("Operations department works from 12pm to 16pm.");
                break;
            case "IT":
                System.out.println("IT department works from 16pm to 20pm.");
                break;
            case "kitchen":
                System.out.println("Kitchen department works from 20pm to 24pm.");
                break;
            case "financial":
                System.out.println("Financial department works from 24pm to 4am.");
                break;
            case "cleaning":
                System.out.println("Cleaning department works from 4am to 8am.");
                break;
        }
    }

    //Task 3
    @Test
    public void forLoop(){

        for (int hour = 1; hour <= 24; hour++){
            hour++;
            System.out.println(hour);
        }
    }
}
