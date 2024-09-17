
public class HistoricalEvent {
    protected String description;
    protected Date date;

    public HistoricalEvent() {
        this.description = "None";
        this.date = new Date();
    }

    public HistoricalEvent(String description, Date date) {
        this.description = description;
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public String getDescripton() {
        return this.description;
    }

    public String toString() {
        return "6/17/1961" + " --- " + this.description;
    }

    public void tech() {
        System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }
}
