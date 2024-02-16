package lflr.arrays.attentionQueues;

import java.util.Date;

public class Entrance {
    private int patientID;
    private String patientName;
    private int patientAge;
    private Date dateEntrance;
    private String reason;
    private String painfulArea;
    private String emergencyLevel;

    Entrance next;

    /**
     * Constructor for the Entrance
     */
    public Entrance(){
        this.patientID = 0;
        this.patientName = "";
        this.patientAge = 0;
        this.dateEntrance = new Date();
        this.reason = "";
        this.painfulArea = "";
        this.emergencyLevel = "";
    }

    /**
     * Constructor for the Entrance with data
     * @param patientID
     * @param dateEntrance
     * @param reason
     * @param painfulArea
     */
    public Entrance(int patientID, String patientName, int patientAge, Date dateEntrance, String reason, String painfulArea, String emergencyLevel){
        this.patientID = patientID;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.dateEntrance = dateEntrance;
        this.reason = reason;
        this.painfulArea = painfulArea;
        this.emergencyLevel = emergencyLevel;


        this.next = null;
    }

    /**
     * Print the Entrance
     */
    public void print(){
        System.out.println("ID: " + this.patientID);
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.patientAge);
        System.out.println("Date Entrance: " + this.dateEntrance);
        System.out.println("Reason: " + this.reason);
        System.out.println("Painful Area: " + this.painfulArea);
        System.out.println("Emergency level: " + this.emergencyLevel);

    }

    @Override
    public String toString(){
        return "ID: " + this.patientID + " Name: " + this.patientName + " Age: " + this.patientAge + " Date Entrance: " + this.dateEntrance + " Reason: " + this.reason + " Painful Area: " + this.painfulArea + " Emergency level: " + this.emergencyLevel;
    }
    public String getEmergencyLevel(){
        return this.emergencyLevel;
    }
    public String setEmergencyLevel(String emergencyLevel){
        return this.emergencyLevel = emergencyLevel;
    }
}
