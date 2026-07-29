class Logger {

    Map<String,Integer> logs;
    public Logger() {
        logs=new HashMap<>();
    }
    
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(logs.containsKey(message)){
            int nextAllowedTime=logs.get(message);
            if(nextAllowedTime<=timestamp){
                logs.put(message,timestamp+10);
                return true;
            }
            return false;
        }else{
            logs.put(message,timestamp+10);
            return true;
        }
    }
}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
