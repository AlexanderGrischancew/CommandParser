public class ReturnPackage {

    private String message = null;
    private boolean isError = false;
    private boolean exitFlag = false;

    public ReturnPackage(String message,boolean isError, Boolean exit){
        this.message = message;
        this.isError = isError;
        this.exitFlag = exit;
    }

    public ReturnPackage(String message){
        new ReturnPackage(message,false,false);
    }

    public boolean isExitFlag(){
        return exitFlag;
    }

    public boolean isError(){
        return isError;
    }

    public String getMessage() {
        return message;
    }
}
