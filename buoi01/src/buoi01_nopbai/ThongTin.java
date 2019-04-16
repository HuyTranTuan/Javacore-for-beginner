package buoi01_nopbai;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
 
public class ThongTin {
    public static void main(String[] args){
        // get system properties
        Properties p = System.getProperties();
        Set<Entry<Object, Object>> set = p.entrySet();
 
        // show system properties
        Iterator<Entry<Object, Object>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry<Object, Object> entry = itr.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key.equals("java.version"))
            System.out.println(key + " = " + value);
            if (key.equals("java.runtime.version"))
                System.out.println(key + " = " + value);
            if (key.equals("java.home"))
                System.out.println(key + " = " + value);
            if (key.equals("java.vendor"))
                System.out.println(key + " = " + value);
            if (key.equals("java.vendor.url"))
                System.out.println(key + " = " + value);
            if (key.equals("java.class.path"))
                System.out.println(key + " = " + value);
        }
    }
}