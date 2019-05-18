package ch5.exceptions;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Implement and test a log record filter that filters out log records containing bad
 * words such as sex, drugs, and C++.
 */
public class Task13 {

    private static final Logger LOGGER = initFilteredLogger();

    public static void main(String[] args) {
        try {
            String text = Files.lines(Path.of("src/resources/test_text.txt"), StandardCharsets.UTF_8)
                    .peek(str -> LOGGER.info(str))
                    .collect(Collectors.joining("\n"));
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Logger initFilteredLogger() {
        Logger logger = Logger.getLogger(Task13.class.getName());
        logger.setUseParentHandlers(false);
        logger.addHandler(new ConsoleHandler());
        logger.setFilter(record -> Stream.of("sex", "drugs", "C++")
                .anyMatch(w -> record.getMessage().toLowerCase().contains(w.toLowerCase())));
        return logger;
    }
}
