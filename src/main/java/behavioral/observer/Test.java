package behavioral.observer;

public class Test {
    public static void main(String[] args) {
        //create subject
        VTVNews topic = new VTVNews();

        //create observers
        Observer obj1 = new VTVAudience("Obj1");
        Observer obj2 = new VTVAudience("Obj2");
        Observer obj3 = new VTVAudience("Obj3");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach observer to subject
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //check if any update is available
        obj1.update();

        //now send message to subject
        topic.postMessage("New Message");
    }
}
