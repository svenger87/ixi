package org.iota.ixi;

import org.iota.ict.Ict;
import org.iota.ict.utils.Properties;

/**
 * This class is just for testing your IXI, so you don't have to run Ict manually.
 * */
public class Main {

    public static void main(String[] args) {
        new Ixi();
        Properties properties = new Properties();
        properties.ixiEnabled = true;
        properties.ixis.add(Ixi.NAME);
        new Ict(properties);
    }
}