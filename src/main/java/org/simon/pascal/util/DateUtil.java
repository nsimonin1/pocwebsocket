package org.simon.pascal.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by SimonPascal on 05/15/2016.
 */
public class DateUtil {
    /**
     *
     */
    private final static SimpleDateFormat sdfTime;

    static {
        sdfTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    /**
     *
     * @return
     */
    public static String getTime() {
        return getTime("yyyy-MM-dd HH:mm:ss");
    }



    public static String getTime(String format) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }
}
