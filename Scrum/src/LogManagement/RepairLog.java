package LogManagement;

import BusManagement.Bus;
import EmployeeManagement.Mechanic;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairLog {

    private Mechanic mechanic;
    private List<Bus> bussesChecked = new ArrayList<>();
    private Date dateChecked;
    private boolean issueFound;
    private String descriptionOfIssue;
    private double issueEstimatedCost;

    public RepairLog(Mechanic mechanic, Date dateChecked, boolean issueFound, 
            String descriptionOfIssue, double issueEstimatedCost) {
        this.mechanic = mechanic;
        this.dateChecked = dateChecked;
        this.issueFound = issueFound;
        this.descriptionOfIssue = descriptionOfIssue;
        this.issueEstimatedCost = issueEstimatedCost;
    }

    public Mechanic getMechanic() {
        return this.mechanic;
    }

    /**
     *
     * @param mechanic
     */
    public void setMechanic(Mechanic mechanic) {
        this.mechanic = mechanic;
    }

    public List<Bus> getBusses() {
        return bussesChecked;
    }

    /**
     *
     * @param bus
     */
    public void addBus(Bus busChecked) {
        this.bussesChecked.add(busChecked);
    }

    public Date getDateChecked() {
        return this.dateChecked;
    }

    /**
     *
     * @param dateChecked
     */
    public void setDateChecked(Date dateChecked) {
        this.dateChecked = dateChecked;
    }

    public boolean getIssueFound() {
        return this.issueFound;
    }

    /**
     *
     * @param issueFound
     */
    public void setIssueFound(boolean issueFound) {
        this.issueFound = issueFound;
    }

    public String getDescriptionOfIssue() {
        return this.descriptionOfIssue;
    }

    /**
     *
     * @param descriptionOfIssue
     */
    public void setDescriptionOfIssue(String descriptionOfIssue) {
        this.descriptionOfIssue = descriptionOfIssue;
    }

    public double getIssueEstimatedCost() {
        return this.issueEstimatedCost;
    }

    /**
     *
     * @param issueCost
     */
    public void setIssueEstimatedCost(double issueEstimatedCost) {
        this.issueEstimatedCost = issueEstimatedCost;
    }

}
