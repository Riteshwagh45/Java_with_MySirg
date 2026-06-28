public class youtube{
    public static class video{
         int   videoId;
        String videoTittle;
        int    videoViews;
        int    videoLikes;
        int   totalVideos;

        //set videoId
        void setVideoid(int id){
            this.videoId = id;

        }   
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

        //get videoId
        public int getVideoid(){
             return videoId;
        }

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
        v1.setVideoid(1);
        v1.setTittle("my sir g");
        v1.setLikes(100);
        v1.setViews(500);
        v1.setTottleVideos(120);

        //getters calling
        System.out.println(v1.getVideoid());
        System.out.println(v1.getTittle());
        System.out.println(v1.getViews());
        System.out.println(v1.getVideolikes());
        System.out.println(v1.getVideolikes());

    }
    
}