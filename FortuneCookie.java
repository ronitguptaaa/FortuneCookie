import java.util.Random;
 
class FortuneCookie {

    static String[] fortunes = {
    "The love of your life is right in front of your eyes."
    ,"Behind this fortune is the love of my life."
    ,"You have a secret admirer."
    ,"Love,because it is the only true adventure."
    ,"The love of your life will appear in front of you unexpectedly!"
    ," An old love will come back to you."
     ,"Follow What Calls you."
     ,"You’re intoxicating when you do what you love."
     ,"Be passionate and totally worth the chaos."
     ,"You will know it when you see it. It will know you when it sees you."
     ,"Do what you love. The rest will fall into place."
     ,"Follow what you love and see what turns up."
     ,"The middle of the process is no place to determine the end of it."
    ,"You should def go for it."
    ,"Enter unknown territory."
    ,"Everything that is was first a dream."
};

    public static void main(String[] args){
        Random rand = new Random();
       int r = rand.nextInt(fortunes.length);
       System.out.println(fortunes[r]);
    }
}
