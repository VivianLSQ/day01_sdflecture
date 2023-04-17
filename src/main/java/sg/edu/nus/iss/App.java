package sg.edu.nus.iss;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Console con = System.console();
        String name = con.readLine("What is your name?");

        if (name.length() > 0) {
            System.out.printf("\nNice to meet you, %s", name);
            System.out.println("\nNice to meet you, " + name);
        } else {
            System.out.println("You have not told me your name");
        }

        Integer age = 80;
        System.out.printf("%s  %d years old.", name, age);
        System.out.println("\n" + name + "is" + age + "years old");
        System.out.print("Testing println, Name: " + name);

        System.out.printf("%s is %d years old.", name, age);
        //%s corresponds to name,and %d corresponds to age respectively

        // different ways to print the same content to console terminal
        System.out.printf("\nNice to meet you, %s", name);

        System.out.printf("%s is %d years old.", name, age);
        

        String input = con.readLine("What is your hobby?");
        input.trim(); // " swim " --> "swim"
        if (input.equals("swim")) {
            System.out.println(" The nearest swimming pool is Clementi");
        } else if (input.equals("jog")) {
            System.out.println("The nearest park is West Coast Park");
        } else if (input.equals("cycle")) {
            System.out.println("You can cycle along the PCN");
        } else {
            System.out.println("Seems like you are a boring person without hobby");
        }

        // Slide 18
        // Switch Statement

        switch (input) {
            case "swim":
                System.out.println(" The nearest swimming pool is in Clementi");
                break;
            case "jog":
                System.out.println("The nearest park is West Coast Park");
                break;
            case "cycle":
                System.out.println("You could cycle along PCN");
                break;
            default:
                System.out.println("Seems like you are a boring person without hobby");
                break;
        }

        // Slide 19
        Integer myAge = 0;
        String inputAge = con.readLine("What is your age?");
        myAge = Integer.parseInt(inputAge);

        if (myAge >= 0 && myAge <= 2) {
            System.out.println("you are a baby");
        } else if (myAge > 2 && myAge <= 4) {
            System.out.println("you are a toddler");
        } else if (myAge > 4 && myAge <= 12) {
            System.out.println("You are a child");
        } else if (myAge > 12 && myAge < 19) {
            System.out.println("You are a teen");
        } else {
            System.out.println("you are an adult");

        }

//Slide 21
Integer i = 0;
input = con. readLine("Type a phrase:");
while (i<input.length()){
    //do/process something here
    //e.g. Clementi --> BeginIndex = 0

System.out.println(input.substring(0, i));

    ///i = i +1 --> i++
    i++;
}
for (int idx = 0; idx <= input.length(); idx++){
    System.out.println(input.substring(0, i)); 
}
//Slide 23
String[] todo = new String[5];
for(int pos = 0; pos < todo.length; pos++){
    input = con.readLine("Enter Todo task" + (pos + 1) + ": ");
    //pos+1 is to insert the first task
    todo[pos] = input;
}

    for (int pos = 0; pos <todo.length; pos++){
        System.out.println("Task " + (pos + 1) + " -->  " + todo[pos]);
    }
}
}
