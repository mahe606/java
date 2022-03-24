package cache;

import java.util.Date;
import java.util.Scanner;

public class DemoCache {
    public static void main(String[] args) {
        try {
            CacheImpl cacheImpl = new CacheImpl();

            cacheImpl.putCache(new Cache("aa", new Date()));
            Thread.sleep(999);
            cacheImpl.putCache(new Cache("bb", new Date()));
            Thread.sleep(9199);
            cacheImpl.putCache(new Cache("cc", new Date()));
            Thread.sleep(1999);
            cacheImpl.putCache(new Cache("dd", new Date()));
            Thread.sleep(999);
            cacheImpl.putCache(new Cache("ee", new Date()));


            cacheImpl.printAllCache();
            cacheImpl.getCache("bb");
            cacheImpl.getCache("aa");


            // get leased used Cache
            Cache c = cacheImpl.getLeastUsedCache();
            System.out.println("Least used one is " + c.getName() + "     " + c.getLastUsedOn());
            cacheImpl.putCache(new Cache("mm", new Date()));


            cacheImpl.printAllCache();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
