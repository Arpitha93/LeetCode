package com.easy;

import java.util.HashMap;

public class LoggerRateLimiter {
    private HashMap<String, Integer> myLogger;

    /** Initialize your data structure here. */
    public Logger() {
        myLogger = new HashMap<String, Integer>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if (!this.myLogger.containsKey(message)) {
            this.myLogger.put(message, timestamp);
            return true;
        }

        Integer oldTimestamp = this.myLogger.get(message);
        if (timestamp - oldTimestamp >= 10) {
            this.myLogger.put(message, timestamp);
            return true;
        } else {
            return false;
        }

    }
}

