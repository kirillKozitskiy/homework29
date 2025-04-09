package DIP;

import java.util.ArrayList;
import java.util.List;

public class SiliconWafer {
    private List<Robot> processes;

    public SiliconWafer(List<Robot> processes) {
        this.processes = processes;
    }

    public void begin(){
        for (Robot robot : processes) {
            robot.runProcess();
        }
    }
}
