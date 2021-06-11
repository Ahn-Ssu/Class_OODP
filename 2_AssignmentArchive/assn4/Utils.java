
public class Utils {

    public static int generateRandomNum(int start, int end){
        int range = Math.max(start,end) - Math.min(start,end) + 1 ;
        return (int)(Math.random() * range); // min <= x <= end 
    }

    public static boolean makeEventorNot(){
        int result = (int)(Math.random() * 10);
        if (result > 6)
            return true;
        else
            return false;
    }

    public static String makeBoldString(String srcString){
        return "\033[1m" + srcString+ "\033[0m";
    }

    public static int makeKW(){
        int KWcase = generateRandomNum(0, 3); // for 20, 22, 24, 26

        if (KWcase == 0) return 20;
        else if (KWcase == 1) return 22;
        else if (KWcase == 2) return 24;
        else return 26;
    }
    
}
