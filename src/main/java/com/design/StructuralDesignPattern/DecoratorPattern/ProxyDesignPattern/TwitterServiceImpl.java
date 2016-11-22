package com.design.StructuralDesignPattern.DecoratorPattern.ProxyDesignPattern;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

/**
 * Created by sahilk on 22/11/16.
 */
public class TwitterServiceImpl implements TwitterService {
    private static final String TWITTER_CONSUMER_KEY = "rHPIC2DQVZ6NOaes9lmhHoAT8";
    private static final String TWITTER_SECRET_KEY = "SWI56kMwGTno2CPawxXpcuuVqG0wmOjnPAkVDTu0BZXyjrWnhi";
    private static final String TWITTER_ACCESS_TOKEN = "1265186947-W4A0ewppBhJOdG1DvUOfdpvt7cfIgAFKLNKmE9q";
    private static final String TWITTER_ACCESS_TOKEN_SECRET = "YQFftFVLahV3e6ZjHYqpc3wV9O5rnq1uftLXP3rwYb7ZR";


    public String getTimeline(String screenName) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey(TWITTER_CONSUMER_KEY)
                .setOAuthConsumerSecret(TWITTER_SECRET_KEY)
                .setOAuthAccessToken(TWITTER_ACCESS_TOKEN)
                .setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();
        StringBuilder builder = new StringBuilder();
        try {
            Query query = new Query(screenName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    builder.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    builder.append("\n");
                }
            } while ((query = result.nextQuery()) != null);

        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return builder.toString();
    }

        public void postToTimeline(String screenName, String message) {
        //we aren't going to allow this
        System.out.println(message);
    }

}
