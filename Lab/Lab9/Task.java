public abstract class Task {
    private int no;
    private String name;
    private int duration;

    public Task(int no, String name, int duration) {
        this.no = no;
        this.name = name;
        this.duration = duration;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public abstract void execute();

    @Override
    public String toString() {
        return String.format("| %-3d| %-22s| %-15s|", no, name, duration + " mills");
    }
}
