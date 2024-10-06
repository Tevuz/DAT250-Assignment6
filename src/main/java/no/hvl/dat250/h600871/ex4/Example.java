package no.hvl.dat250.h600871.ex4;

public class Example {

    public static void main(String[] args) throws Exception {
        ReceiveLogs.main(null);

        EmitLog.main(new String[]{});
        EmitLog.main(new String[]{"Example log message"});
    }
}
