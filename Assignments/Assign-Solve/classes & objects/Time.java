public class Time {
    static class time{
        int hours;
        int minutes;
        int seconds;
        
     void  settime(int a , int b, int c){
            hours = a;
            minutes = b;
            seconds = c;
        }
         void showTime(){
            System.out.println(hours+ "hr " +minutes+ "min " +seconds+ "sec" );
         }
    }
    public static void main(String[] args) {
        time t = new time();
        t.settime(3, 45, 20);
        t.showTime();
        
        
    }
}
