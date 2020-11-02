public class WhileLoopDemo {
    public static void main(String[] args) {
        String [] friends = new String [20];
        friends[0] = "Masha";
        friends[1] = "Matilda";
        friends[2] = "Rosa";
        friends[17] = "Rosalinda";
        friends[18] = "Hillary";
        friends[19] = "Natasha";

        int total = friends.length;
        int i=0;

        while(i<total) {
            if (friends[i] == null) {
                i++;
                continue;
            }
            System.out.println("I love " + friends[i]);
            if (friends[i] == "Rosalinda")
                break;

            i++;
        }
        System.out.println("The iteration is over");
    }
}
