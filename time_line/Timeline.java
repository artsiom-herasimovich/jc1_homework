package jc1_homework.time_line;

public class Timeline {
    private final long secGap;
    private final long hours;
    private final long minutes;
    private final long seconds;

    public Timeline(long secGap) {
        this.secGap = secGap;
        hours = secGap/3600;
        minutes = (secGap - hours * 3600)/60;
        seconds = secGap - hours * 3600 - minutes * 60;
    }

    public Timeline(long hours, long minutes, long seconds) {
        secGap = seconds + minutes * 60 + hours * 3600;
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public long getSecGap() {
        return secGap;
    }

    public long compareTo(Timeline time){
        return (this.secGap - time.secGap);

    }

    public String getTime() {
        String sec = (seconds > 10) ? ("" + seconds) : ("0"+seconds);
        String min = (minutes > 10) ? ("" + minutes) : ("0"+minutes);
        String fulltime = hours+":"+min+":"+sec;
        return fulltime;
    }
}
