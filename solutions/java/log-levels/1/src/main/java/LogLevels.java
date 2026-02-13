public class LogLevels {
    
    public static String message(String logLine) {
        if(logLine.contains(":")) {
        	String[] split = logLine.split(":");
        	logLine = split[1].trim();
        }
       
        return logLine;
         }

    public static String logLevel(String logLine) {
        int start = logLine.indexOf('[') + 1;
        int end = logLine.indexOf(']');
        return logLine.substring(start, end).toLowerCase();
    }
   

    public static String reformat(String logLine) {
        
     String message =  message(logLine);
      String logLevel =  logLevel(logLine);
        String reformat = "";
            reformat = message + " (" + logLevel + ")";
        return reformat;
        }
}
