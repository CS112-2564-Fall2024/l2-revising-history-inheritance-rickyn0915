public class RevisedEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    public RevisedEvent() {
        super();

        this.revisedDescription = "None";
        this.citation = "None";
    }

    public RevisedEvent(String description, Date date, String revisedDescription, String citation) {
        super(description, date);
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    public String getCitation()
    {
        return this.citation;
    }

    //@Override
    public String toString() {
        String superString = super.toString();

        return superString + '\n' + this.revisedDescription + '\n' + this.citation;
    }

    public int compareTo(Object object)
    {
        if (object instanceof HistoricalEvent) {
            HistoricalEvent event = (HistoricalEvent) object;
            if (this.date.precedes(event.date)) {
                return -1;
            }
            if (this.date.equals(event.date))
                return 0;
        }
        return 1;
     }
    public void teach() {
        System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }
}
