package test.knights;

import java.io.PrintStream;

public class KillDragonQuest implements Quest {
    private PrintStream stream;

    public KillDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to kill the dragon!");
    }
}
