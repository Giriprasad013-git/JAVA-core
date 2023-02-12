public class SecondstoHMS {
    public static void main(String[] args) {
        int sec=10000;
        int hr=sec/3600;
        int remainSec=sec%3600;
        int min=remainSec/60;
        remainSec=remainSec%60;
        System.out.println(hr+":"+min+":"+remainSec);
    }
}
