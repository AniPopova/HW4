public class condition4 {
    public static void main(String[] args) {
        String myName = "Ani";
        String myFamilyName = "Popova";
        int myAge = 38;
        String myFriend = "Mariya";
        int myFriendAge = 37;

        // System.out.println(myName+"\t"+myFamilyName);
        /*
        System.out.println(myName.equals(myFriend)+"\n"+ myName.toLowerCase()+"\n"
        +myName.equalsIgnoreCase(myFriend)+"\n"+myFriend.compareTo(myName)+"\n"+myFriend.toUpperCase());
        */
        //System.out.println(myName.concat("\n"+myFamilyName));
        //System.out.println("I am "+myName.concat("\t"+myFamilyName)+" and my age is\n"+myAge);
        //System.out.println("Hi my name is\t"+myName.concat("\t"+myFamilyName)+" and my age is\t"+myAge);
        System.out.println("Hi my name is\t"+myName.concat("\t"+myFamilyName)+
                " and my age is\t"+myAge+"\n"
                +"My best friend is\t"+myFriend+"\t"+
                "and she is "+myFriendAge+"\tyears old.");
    }
}
