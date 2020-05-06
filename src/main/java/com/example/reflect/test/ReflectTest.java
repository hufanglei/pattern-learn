package com.example.reflect.test;

import java.io.*;
import java.util.Properties;

/**
 * Title: ReflectTest
 * Description: TODO
 *
 * @author hfl
 * @version V1.0
 * @date 2020-05-02
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {
        Mainboard mainboard = new Mainboard();
        mainboard.run();
        // mainboard.userPCI(new SoundPCI());
        //通过反射调用pci
        usePCI(mainboard);
    }

    private static void usePCI(Mainboard mainboard) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
//        File file = new File("pci.properties");
        Properties props = new Properties();
        InputStream in = ReflectTest.class.getClassLoader().getResourceAsStream("pci.properties");
        props.load(in);
        for (int i = 0; i < props.size(); i++) {
            String pciName = props.getProperty("pci" + (i + 1));
            Class clazz = Class.forName(pciName);
            PCI p = (PCI) clazz.newInstance();
            mainboard.userPCI(p);
        }
    }
}
