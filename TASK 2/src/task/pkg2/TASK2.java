/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.pkg2;

/**
 *
 * @author MABOW
 */
public class TASK2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String taskName;
        String taskDescription;
        int taskNumber;
        String developerDetails;
        int taskDuration;
        String taskId;
        String taskStatus;
    
   
        public boolean checkTaskDescription(String Description)
        {
            if(Description.length()<= 50)
                return true;
            else
                return false; 
        }
        public String createTaskID()
        {
            taskId = taskName.substring(0,2) + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length() -3); 
            return taskId;
        }
        public String printTaskDetails()
        {
            return "";
        }
        public String returnTotalHours()
        {
            return "";
        }
}
    
