package ch5.exceptions;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.logging.*;

/**
 * Implement and test a log record formatter that produces an HTML file.
 */
public class Task14 {

    private static final Logger LOGGER;

    static {
        FileHandler handler = null;
        try {
            handler = new FileHandler("log/log%u.html");
            handler.setFormatter(new HtmlFormatter());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Can`t open log file");
        }

        LOGGER = Logger.getLogger(Task14.class.getName());
        LOGGER.addHandler(handler);
    }

    public static void main(String[] args) {
        LOGGER.info("start program");
        LOGGER.warning("alarm example");
        LOGGER.info("end program");
    }

    private static class HtmlFormatter extends Formatter {

        @Override
        public String format(LogRecord rec) {
            StringBuffer buf = new StringBuffer(1000);
            buf.append("<tr>\n");

            // colorize any levels >= WARNING in red
            if (rec.getLevel().intValue() >= Level.WARNING.intValue()) {
                buf.append("\t<td style=\"color:red\">");
                buf.append("<b>");
                buf.append(rec.getLevel());
                buf.append("</b>");
            } else {
                buf.append("\t<td>");
                buf.append(rec.getLevel());
            }

            buf.append("</td>\n");
            buf.append("\t<td>");
            buf.append(LocalDateTime.ofInstant(Instant.ofEpochMilli(rec.getMillis()), ZoneId.systemDefault()));
            buf.append("</td>\n");
            buf.append("\t<td>");
            buf.append(formatMessage(rec));
            buf.append("</td>\n");
            buf.append("</tr>\n");

            return buf.toString();
        }

        @Override
        public String getHead(Handler h) {
            return "<!DOCTYPE html>\n<head>\n<style>\n"
                    + "table { width: 100% }\n"
                    + "th { font:bold 10pt Tahoma; }\n"
                    + "td { font:normal 10pt Tahoma; }\n"
                    + "h1 {font:normal 11pt Tahoma;}\n"
                    + "</style>\n"
                    + "</head>\n"
                    + "<body>\n"
                    + "<h1>" + (LocalDate.now()) + "</h1>\n"
                    + "<table border=\"0\" cellpadding=\"5\" cellspacing=\"3\">\n"
                    + "<tr align=\"left\">\n"
                    + "\t<th style=\"width:10%\">Loglevel</th>\n"
                    + "\t<th style=\"width:15%\">Time</th>\n"
                    + "\t<th style=\"width:75%\">Log Message</th>\n"
                    + "</tr>\n";
        }

        @Override
        public String getTail(Handler h) {
            return "</table>\n</body>\n</html>";
        }
    }
}
