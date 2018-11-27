package com.my.lei.test.think_in_java.innerclasses.test10dot8;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Event> eventList = new ArrayList<Event>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            for(Event e: new ArrayList<Event>(eventList)){
            //for (Event e : eventList) {
//                Exception in thread "main" java.util.ConcurrentModificationException
//                at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
//                at java.util.ArrayList$Itr.next(ArrayList.java:859)
//                at com.my.lei.test.think_in_java.innerclasses.test10dot8.Controller.run(Controller.java:15)
//                at com.my.lei.test.think_in_java.innerclasses.test10dot8.Main.main(Main.java:19)
                if (e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
