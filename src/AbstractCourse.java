public abstract class AbstractCourse {
    private String title;
    private double duration;
    private String instructor;
    public abstract void conductClass();

    public void startCourse(){
        System.out.println("Курс "+ title + " начинается" );
    }

    public AbstractCourse() {
    }

    public AbstractCourse(String title, double duration, String instructor) {
        this.title = title;
        this.duration = duration;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
