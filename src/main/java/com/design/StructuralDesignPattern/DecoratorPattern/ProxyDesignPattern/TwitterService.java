package com.design.StructuralDesignPattern.DecoratorPattern.ProxyDesignPattern;

/**
 * Created by sahilk on 22/11/16.
 */
public interface TwitterService {

     String getTimeline(String screenName);
     void postToTimeline(String screenName, String tweet);


}
