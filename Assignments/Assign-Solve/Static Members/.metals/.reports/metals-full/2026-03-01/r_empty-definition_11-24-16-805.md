error id: file:///D:/java_with_Saurabh_shukla/Static%20Members/youtube.java:java/lang/System#
file:///D:/java_with_Saurabh_shukla/Static%20Members/youtube.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1394
uri: file:///D:/java_with_Saurabh_shukla/Static%20Members/youtube.java
text:
```scala
public class youtube{
    public static class video{

        String videoTittle;
        int    videoViews;
        int    videoLikes;
        int   totalVideos;
           
        //set video tittle
        void setTittle(String tittle){
            this.videoTittle = tittle;
        }
        //set video views
        void setViews(int views){
            this.videoViews = views;
        }
        //set likes
        void setLikes(int likes){
              this.videoLikes = likes;
        }
        //set total videos
        void setTottleVideos(int total){
            this.totalVideos = total;
        }

        //#getters 

        //get videos tittle
        public String getTittle(){
            return videoTittle;
        }

        //get views
        public int getViews(){
            return videoViews;
        }

        //get video likes
        public int getVideolikes(){
            return videoLikes;
        }

        //get totalvideos
        public int totalVideos(){
            return totalVideos;
        }
    }
    public static void main(String[] args) {
        //constructor call
       video v1 = new video();

          //setters  calling
        v1.setTittle("my sir g");
        v1.setLikes(100);
        v1.setViews(500);
        v1.setTottleVideos(120);

        //getters calling
        @@System.out.println();
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#