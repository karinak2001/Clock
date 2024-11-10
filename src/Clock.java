public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString(){
        return this.hour + ":" + this.minute + ":" + this.second;
    }

    public boolean isValid(){
        boolean valid = true;
        if (this.hour >= 23 && this.hour <= 00){
            return false;
        } else if (this.minute >= 59 && this.minute <= 00) {
            return false;
        } else if (this.second >= 59 && this.second <= 00) {
            return false;
        }
        return true;
    }


    public boolean isEarlier(Clock other){
        boolean earlier = true;

    }
}
