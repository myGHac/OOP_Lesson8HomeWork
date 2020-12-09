package task2;

public class Worker {

    private String workerName;
    private String profession;
    private int year;

    public Worker() {
    }

    public Worker(String workerName, String profession, int year) {
        this.workerName = workerName;
        this.profession = profession;
        this.year = year;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWorkerName() {
        return workerName;
    }

    public String getProfession() {
        return profession;
    }

    public int getYear() {
        return year;
    }


    @Override
    public String toString() {
        return  workerName + "  " + profession + " " +  year;
    }



}
