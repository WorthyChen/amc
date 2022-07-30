package org.chaniiuhoo.amc.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

@Slf4j
public class DemoUtil {
    public static void filter(String username) {
        if (StringUtils.containsWhitespace(username)) {
            log.error(username + "the current username is invalid!");
        }
    }
}
