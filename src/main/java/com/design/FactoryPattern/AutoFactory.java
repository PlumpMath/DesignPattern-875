package com.design.FactoryPattern;


import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by sahilk on 05/11/16.
 */
public class AutoFactory {

    Map<String,Class<? extends Cars>> carMap = new HashMap<String, Class<? extends Cars>>();
    public AutoFactory() {
        carLookUp();
    }

    private void carLookUp() {
        Reflections reflections = new Reflections("com.design.FactoryPattern");
        Set<Class<? extends Cars>> carClasses = reflections.getSubTypesOf(Cars.class);
        for(Class<? extends Cars> cars:carClasses){
            carMap.put(cars.getSimpleName(), cars);
        }
    }

    public Cars getAutoCarInstance(String carName)
            throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        if(!carMap.isEmpty()) {
            Class clasz = carMap.get(carName);
            if (clasz != null) {
                return (Cars) clasz.newInstance();
            }
        }
        return null;
    }
}
