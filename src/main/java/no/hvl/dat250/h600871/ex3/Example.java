package no.hvl.dat250.h600871.ex3;

public class Example {

    public static void main(String[] args) throws Exception {
        Dispatcher.main(new String[]{"First", "Message."});
        Dispatcher.main(new String[]{"Second", "Message.."});
        Dispatcher.main(new String[]{"Third", "Message..."});
        Dispatcher.main(new String[]{"Fourth", "Message...."});
        Dispatcher.main(new String[]{"Fifth", "Message....."});

        Worker.main(new String[]{"1"});
        Worker.main(new String[]{"2"});
    }
}
