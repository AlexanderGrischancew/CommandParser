public class CommandExample {

    private static boolean run = true;
    private static CommandLibrary commandLibrary = new CommandLibrary();

    public static void main(String args[]){
        setup();
        while(run){

            //READ INPUT
            String input = "quit";
            //----------

            printReturnPackage(commandLibrary.executeCommand(input));
        }
    }

    private static void setup(){
        //SETUP
        //ADD COMMANDS TO LIBARY
        for(CommandsEnum commandEnumCommand: CommandsEnum.values()){
            commandLibrary.addCommand(commandEnumCommand.getCommandRegex(),commandEnumCommand.getCommand());
        }
    }

    //Halts the main loop
    private static void stop(){
        run = false;
    }


    //This method grants that only the main class can print to the user.
    private static void printReturnPackage(ReturnPackage returnPackage){
        // As every new-line needs to be outputed separately, the toString of
        // the Message is split at "\n" and then a Terminal.printline
        // method-call is conducted for each token.
        String[] messageLines = returnPackage.getMessage().trim().split("\n");

        if (returnPackage.isError() && !returnPackage.getMessage().equals("")) {
            for (String line : messageLines) {
                //output
            }
        } else if (!returnPackage.isError() && !returnPackage.getMessage().equals("")) {
            for (String line : messageLines) {
                //output
            }
        }

        //If the ReturnMessage carries a Exit Signal:
        if (returnPackage.isExitFlag()){
            stop();
            return;
        }
    }

}
