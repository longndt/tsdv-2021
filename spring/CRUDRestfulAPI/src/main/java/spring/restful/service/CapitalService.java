package spring.restful.service;


import spring.restful.bean.Capital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CapitalService {
    private static HashMap<Integer, Capital> capitalHashMap = getCapitalHashMap();

    private static HashMap<Integer, Capital> getCapitalHashMap() {
        return capitalHashMap;
    }

    public CapitalService() {
        if (capitalHashMap == null) {
            capitalHashMap = new HashMap<Integer, Capital>();

            Capital hanoi = new Capital(1, "Hanoi", "Vietnam");
            Capital bangkok = new Capital(2, "Bangkok", "Thailand");
            Capital paris = new Capital(3, "Paris", "France");

            capitalHashMap.put(1, hanoi);
            capitalHashMap.put(2, bangkok);
            capitalHashMap.put(3, paris);
        }
    }

    public List getAllCapitals() {
        List capitals = new ArrayList(capitalHashMap.values());
        return capitals;
    }

    public Capital getCapital (int id) {
        Capital capital = capitalHashMap.get(id);
        return capital;
    }

    public Capital addCapital (Capital capital) {
        capital.setId(getMaxId()+1);
        capitalHashMap.put(capital.getId(),capital);
        return capital;
    }

    public Capital updateCapital (Capital capital) {
        if (capital.getId()<=0) {
            return null;
        }
        capitalHashMap.put(capital.getId(),capital);
        return capital;
    }

    public void deleteCapital (int id) {
        capitalHashMap.remove(id);
    }

    private static int getMaxId() {
        int max = 0;
        for (int id:capitalHashMap.keySet()) {
            if (max<=id) {
                max = id;
            }
        }
        return max;
    }
}
