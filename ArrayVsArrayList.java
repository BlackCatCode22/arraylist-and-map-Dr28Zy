import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {


        ArrayList<String> friendsArrayList = new ArrayList<>();

        friendsArrayList.add("John");
        friendsArrayList.add("Chris");
        friendsArrayList.add("Eric");
        friendsArrayList.add("Luke");
        friendsArrayList.add("Mitch");

        System.out.println("\n my first friend is " + friendsArrayList.get(0));
        System.out.println("\n my second friend is " + friendsArrayList.get(1));
        System.out.println("\n my third friend is " + friendsArrayList.get(2));
        System.out.println("\n my fourth friend is " + friendsArrayList.get(3));
        System.out.println("\n my fifth friend is " + friendsArrayList.get(4));

        System.out.println("\n the size (number of elements) " + friendsArrayList.size());

        friendsArrayList.set(0,"Daniel");
        System.out.println("\n my first friend is now " + friendsArrayList.get(0));

        // Remove the third element.
        friendsArrayList.remove(0);

        // output the list without a for loop
        System.out.println(friendsArrayList);

        int myFriendNumber = 1;

        for (int i = 0; i < friendsArrayList.size(); i++); {

            int i = 0;
            System.out.println(" friend " + myFriendNumber + " is " + friendsArrayList.get(i));
            myFriendNumber++;
        }
        // add list elements with a for loop
        for (int i=0; i<10; i++) {
            // use .add()
            friendsArrayList.add( i+4, "new friend");
            System.out.println(" new friend added to list");

            System.out.println(friendsArrayList);


            }
        }
        }
