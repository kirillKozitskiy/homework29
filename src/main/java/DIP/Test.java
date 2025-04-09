package DIP;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Robot photoProcess = new Photolithography();
        Robot alloyProcess = new Alloying();

        SiliconWafer wafer = new SiliconWafer(Arrays.asList(photoProcess, alloyProcess));
        wafer.begin();

    }
}
