package app;

import java.util.LinkedList;
import java.util.ArrayList;

public class Linkedlist {
    public static void main(String[] args) {
        // create likedlist
        LinkedList<String> myLikedlist = new LinkedList<>();
        myLikedlist.add("A");
        myLikedlist.add("B");
        myLikedlist.addFirst("C");
        myLikedlist.addLast("D");
        System.out.println(myLikedlist);

        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add("Jobs");
        lastNames.add("Gates");
        myLikedlist.addAll(lastNames);
        System.out.println(myLikedlist);
        System.out.println(myLikedlist.size());

        myLikedlist.remove("Gates");
        System.out.println(myLikedlist);

        boolean status = myLikedlist.contains("Jobs");
        if (status) {
            System.out.println("My likedlist contains Jobs");}
        else {
            System.out.println("My likedlist doesn't  contains Jobs");
        }
        String firstElement = myLikedlist.getFirst();
        System.out.println(firstElement);
        //deleting all elements
        myLikedlist.clear();
        System.out.println(myLikedlist);
        }

    }