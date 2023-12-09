public class Eighth_Task {
    public static void main(String[] args){
        int flight = 0;
        while (flight < 2117){
            flight = flight + 79;
            if (flight % 79 == 0 && flight > 1817 && flight < 2117){
                System.out.println(flight);
            }
        }
    }
}
