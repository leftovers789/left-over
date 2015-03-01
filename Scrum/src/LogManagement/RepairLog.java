package LogManagement;


import BusManagement.Bus;
import EmployeeManagement.Mechanic;
import java.util.Date;

public class RepairLog {

    private Mechanic mechanic;
    private Bus busChecked;
    private Date dateChecked;
    private boolean issueFound;
    private String descriptionOfIssue;
    private double issueCost;

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

    public Bus getBus() {
        return busChecked;
    }

    /**
     *
     * @param bus
     */
    public void setBus(Bus busChecked) {
        this.busChecked = busChecked;
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

    public double getIssueCost() {
        return this.issueCost;
    }

    /**
     *
     * @param issueCost
     */
    public void setIssueCost(double issueCost) {
        this.issueCost = issueCost;
    }
	
}
