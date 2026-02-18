public class LogLine {

    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
    String  logLevel = logLine.substring(1, 4);
    switch(logLevel){
        case "INF":
            return LogLevel.INFO;
        case "TRC":
            return LogLevel.TRACE;
        case "DBG":
            return LogLevel.DEBUG;
        case "WRN":
            return LogLevel.WARNING;
        case "ERR":
            return LogLevel.ERROR;
        case "FTL":
            return LogLevel.FATAL;
        default :
            return LogLevel.UNKNOWN;

    }
        
    }

    public String getOutputForShortLog() {
        LogLevel level = getLogLevel();
        int messageStart = logLine.indexOf("]:");
        if (messageStart == -1) {
            return level.getEncodedLevel() + ":";
        }

         String message = logLine.substring(messageStart + 2).trim();

                return level.getEncodedLevel() + ":" + message;

     }
}
