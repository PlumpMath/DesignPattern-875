package com.design.StructuralDesignPattern.DecoratorPattern.ProxyDesignPattern;

/**
 * Created by sahilk on 22/11/16.
 */
public class MainClass {


    public static void main(String[] args) {
        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        System.out.println(service.getTimeline("18Kohli"));
        service.postToTimeline("18kohli","trying to post tweet");
    }
}
