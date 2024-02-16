package lflr.arrays.attentionQueues;

import lflr.arrays.IManager;
import lflr.arrays.Main;


import java.util.Date;
import java.util.Scanner;

public class GeneralQueueRunner implements IManager {
    private static final Scanner scannerText = new Scanner(System.in);
    public int finish = 1;
    public static int id = 0;
    public static GeneralQueue<Entrance> generalQueue = new GeneralQueue<>();
    public final static EmergencyQueue<Entrance> emergencyQueue = new EmergencyQueue<>();
    public static GeneralQueue<Entrance> auxQueue = new GeneralQueue<>();

    public static GeneralQueue<Entrance> oncologyQueue = new GeneralQueue<>();
    public static GeneralQueue<Entrance> traumatologyQueue = new GeneralQueue<>();
    public static GeneralQueue<Entrance> neurologyQueue = new GeneralQueue<>();
    public static GeneralQueue<Entrance> cardiologyQueue = new GeneralQueue<>();
    public static GeneralQueue<Entrance> nephrologyQueue = new GeneralQueue<>();
    public static GeneralQueue<Entrance> pneumologyQueue = new GeneralQueue<>();
    public static GeneralQueue<Entrance> gastroenterologyQueue = new GeneralQueue<>();


    /**
     * This method is the main method of the class, it runs the program
     */
    @Override
    public void run() {
        System.out.println("GeneralQueue is running");
        System.out.println("A. Menu GeneralQueue");
        System.out.println("B. Menu EmergencyQueue");
        System.out.println("C. Print the specialist queues");
        System.out.println("D. Exit to main menu");
        System.out.println("E. Add example entrances");
        finish = 1;
        switch (inputOption()) {
            case "A":
                while (finish != 0) {
                    menu();
                    executeGeneralQueue();
                }
                break;
            case "B":
                while (finish != 0) {
                    menuEmergency();
                    executeEmergencyQueue();
                }
                break;
            case "C":
                printSpecialistQueues();
                break;
            case "D":
                Main.main(null);
                break;
            case "E":
                addExampleEntrances();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    /**
     * This method is the menu general, it shows the options of the program
     */
    public void menu() {
        System.out.println("//////////////////////////////////////////");
        System.out.println("Choose a action");
        System.out.println("a. Print the queue");
        System.out.println("b. Add a entrance at queue end");
        System.out.println("c. Attend a entrance at queue front");
        System.out.println("d. See the size of the queue");
        System.out.println("e. See the front of the queue");
        System.out.println("f. Queue exit");
        System.out.println("//////////////////////////////////////////");
    }

    /**
     * @return the option of the user
     */
    public static String inputOption() {
        System.out.println("Enter your choice: ");
        return scannerText.nextLine();
    }

    /**
     * @return the value of the user
     * use a try catch to validate the input
     */
    public static int inputValue() {
        System.out.println("Enter a value: ");
        String value = scannerText.nextLine();
        try {
            Integer.parseInt(value);
            int valueInt = Integer.parseInt(value);
            return valueInt;
        } catch (NumberFormatException exception) {
            System.out.println("Is not a integer number, try again");
            return inputValue();
        }
    }

    /**
     * This method execute the general queue
     * It has a switch case to execute the options
     */
    public void executeGeneralQueue() {
        switch (inputOption()) {
            case "a":
                if (generalQueue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    generalQueue.print();
                }
                break;
            case "b":
                generalQueue.enqueue(newEntrance());
                break;
            case "c":
                if (generalQueue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The patient need special attention? y/n");
                    if (scannerText.nextLine().equals("y")) {
                        System.out.println("The patient need special attention, remove from the queue");
                        System.out.println("Derive to:");
                        System.out.println("1. Oncology");
                        System.out.println("2. Traumatology");
                        System.out.println("3. Neurology");
                        System.out.println("4. Cardiology");
                        System.out.println("5. Nephrology");
                        System.out.println("6. Pneumology");
                        System.out.println("7. Gastroenterology");
                        switch (inputValue()) {
                            case 1:
                                oncologyQueue.enqueue(generalQueue.dequeue());
                                break;
                            case 2:
                                traumatologyQueue.enqueue(generalQueue.dequeue());
                                break;
                            case 3:
                                neurologyQueue.enqueue(generalQueue.dequeue());
                                break;
                            case 4:
                                cardiologyQueue.enqueue(generalQueue.dequeue());
                                break;
                            case 5:
                                nephrologyQueue.enqueue(generalQueue.dequeue());
                                break;
                            case 6:
                                pneumologyQueue.enqueue(generalQueue.dequeue());
                                break;
                            case 7:
                                gastroenterologyQueue.enqueue(generalQueue.dequeue());
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                    } else {
                        System.out.println("The patient does not need special attention. It has already been attended to");
                        System.out.println("The entrance removed is: " + generalQueue.dequeue());
                    }
                }
                break;
            case "d":
                System.out.println("The size of the queue is: " + generalQueue.size());
                break;
            case "e":
                if (generalQueue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The front of the queue is: " + generalQueue.first());
                }
                break;
            case "f":
                finish = 0;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    /**
     * @return a new entrance
     * It asks the user for the data of the entrance
     */
    private Entrance newEntrance(){
        int id = this.id++;
        System.out.println("Enter the name of the patient");
        String name = scannerText.nextLine();
        System.out.println("Enter the age of the patient");
        int age = inputValue();
        System.out.println("Enter the reason of the entrance");
        String reason = scannerText.nextLine();
        System.out.println("Enter the painful area of the patient");
        String painfulArea = scannerText.nextLine();
        Date date = new Date();

        Entrance entrance = new Entrance(id, name, age, date, reason, painfulArea, "general");
        return entrance;
    }

    /**
     * This method is the menu emergency, it shows the options of the program
     */
    public void menuEmergency(){
        System.out.println("//////////////////////////////////////////");
        System.out.println("Choose a action");
        System.out.println("a. Print the queue");
        System.out.println("b. Add a entrance at queue");
        System.out.println("c. Attend a entrance at queue front");
        System.out.println("d. See the front of the queue");
        System.out.println("e. See the size of the queue");
        System.out.println("f. Queue exit");
        System.out.println("//////////////////////////////////////////");
    }

    /**
     * This method execute the emergency queue
     * It has a switch case to execute the options
     */
    public void executeEmergencyQueue() {
        switch (inputOption()) {
            case "a":
                if (emergencyQueue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    emergencyQueue.print();
                }
                break;
            case "b":
                Entrance entrance = newEmergencyEntrance();
                switch (entrance.getEmergencyLevel()) {
                    case "emergency":
                        System.out.println("The patient is in emergency, add to the front of the queue");
                        emergencyQueue.addFirst(entrance);
                        break;
                    case "urgent":
                        System.out.println("The patient is in urgent, add to the end of the queue");
                        emergencyQueue.addLast(entrance);
                        break;
                    case "none":
                        entrance.setEmergencyLevel("general");
                        System.out.println("The patient is not in emergency, add to the general queue");
                        generalQueue.enqueue(entrance);
                        break;
                    default:
                        System.out.println("Invalid emergency level");
                        break;
                }
                break;
            case "c":
                if (emergencyQueue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The patient is stable? or died y/n");
                    if (scannerText.nextLine().equals("y")) {
                        System.out.println("The patient is stable, add into general queue");
                        generalQueue.enqueue(auxQueue.first());
                        auxQueue.dequeue();
                        emergencyQueue.removeFirst();
                        System.out.println("The entrance removed");
                    } else {
                        System.out.println("The patient died, remove from the queue");
                        emergencyQueue.removeFirst();
                        System.out.println("The entrance removed");
                    }
                }
                break;
            case "d":
                if (emergencyQueue.isEmpty()) {
                    System.out.println("The queue is empty");
                } else {
                    System.out.println("The front of the queue is: " + emergencyQueue.first());
                }
                break;
            case "e":
                System.out.println("The size of the queue is: " + emergencyQueue.size());
                break;
            case "f":
                finish = 0;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    /**
     * @return a new emergency entrance
     * It asks the user for the data of the entrance
     */
    private Entrance newEmergencyEntrance(){
        int id = this.id++;
        System.out.println("Enter the name of the patient");
        String name = scannerText.nextLine();
        System.out.println("Enter the age of the patient");
        int age = inputValue();
        System.out.println("Enter the reason of the entrance");
        String reason = scannerText.nextLine();
        System.out.println("Enter the painful area of the patient");
        String painfulArea = scannerText.nextLine();
        Date date = new Date();
        System.out.println("Enter an emergency level such as: emergency, urgent or none");
        String emergencyLevel = scannerText.nextLine();

        Entrance entrance = new Entrance(id, name, age, date, reason, painfulArea, emergencyLevel);
        auxQueue.enqueue(entrance);
        return entrance;
    }

    /**
     * This method add example entrances to the queues
     */
    public void addExampleEntrances(){
        int id = this.id;
        generalQueue.enqueue(new Entrance(id++, "John", 25, new Date(), "Headache", "Head", "general"));
        generalQueue.enqueue(new Entrance(id++, "Mary", 30, new Date(), "Stomachache", "Stomach", "general"));
        generalQueue.enqueue(new Entrance(id++, "Peter", 40, new Date(), "Chest pain", "Chest", "general"));
        generalQueue.enqueue(new Entrance(id++, "Lucy", 35, new Date(), "Back pain", "Back", "general"));
        generalQueue.enqueue(new Entrance(id++, "Paul", 45, new Date(), "Leg pain", "Leg", "general"));

        emergencyQueue.addFirst(new Entrance(id++, "Johny", 25, new Date(), "Headache", "Head", "emergency"));
        emergencyQueue.addFirst(new Entrance(id++, "Marylu", 30, new Date(), "Stomachache", "Stomach", "emergency"));
        emergencyQueue.addFirst(new Entrance(id++, "Raul", 40, new Date(), "Chest pain", "Chest", "emergency"));

        auxQueue.enqueue(new Entrance(id-1, "Raul", 40, new Date(), "Chest pain", "Chest", "emergency"));
        auxQueue.enqueue(new Entrance(id-2, "Marylu", 30, new Date(), "Stomachache", "Stomach", "emergency"));


        emergencyQueue.addLast(new Entrance(id++, "Fernand", 35, new Date(), "Back pain", "Back", "urgent"));
        emergencyQueue.addLast(new Entrance(id++, "Jimmy", 45, new Date(), "Leg pain", "Leg", "urgent"));

        oncologyQueue.enqueue(new Entrance(id++, "Krist", 25, new Date(), "Headache", "Head", "general"));
        traumatologyQueue.enqueue(new Entrance(id++, "Marylin", 30, new Date(), "Stomachache", "Stomach", "general"));
        traumatologyQueue.enqueue(new Entrance(id++, "Patrick", 40, new Date(), "Chest pain", "Chest", "general"));
    }

    /**
     * This method print the specialist queues
     * It shows the size of the queues and the data of the entrances
     */
    public void printSpecialistQueues(){
        System.out.println("Oncology: " + oncologyQueue.size());
        oncologyQueue.print();
        System.out.println("Traumatology: " + traumatologyQueue.size());
        traumatologyQueue.print();
        System.out.println("Neurology: " + neurologyQueue.size());
        neurologyQueue.print();
        System.out.println("Cardiology: " + cardiologyQueue.size());
        cardiologyQueue.print();
        System.out.println("Nephrology: " + nephrologyQueue.size());
        nephrologyQueue.print();
        System.out.println("Pneumology: " + pneumologyQueue.size());
        pneumologyQueue.print();
        System.out.println("Gastroenterology: " + gastroenterologyQueue.size());
        gastroenterologyQueue.print();
    }
}