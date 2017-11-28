/**
 * This Enum hold all {@link Command}s and theyer corresponding RegEx.
 *
 * This Enums makes it easy to manage all Command to be added to the Command Library.
 *
 * @author Alexander Grischancew
 */
public enum CommandsEnum {

    //Commands List:--
    QUIT_COMMAND("quit","",new ExitCommand());
    //----------------

    private final String commandPrefix;
    private final String commandSuffix;
    private final Command command;


    CommandsEnum(String commandPrefix,String commandSuffix, Command command){
        this.commandPrefix = commandPrefix;
        this.commandSuffix = commandSuffix;
        this.command = command;
    }

    /**
     * Returns the commandPrefix of the Command.
     *
     * The commandPrefix String should be interpreted as a RegEx.
     *
     * @return the commandPrefix as String.
     */
    public String getCommandPrefix() {
        return commandPrefix;
    }

    /**
     * Returns the commandSuffix of the Command.
     *
     * The commandSuffix should be interpreted as a RegEx.
     *
     * @return the commandSuffix as String.
     */
    public String getCommandSuffix() {
        return commandSuffix;
    }

    /**
     * Return the combination of commandPrefix and the commandSuffix separated by a space.
     *
     * The commandRegex should be interpreted as a RegEx.
     *
     * @return the commandRegex as String.
     */
    public String getCommandRegex() {
        return (commandPrefix+" "+commandSuffix).trim();
    }

    /**
     * Returns the {@link Command}.
     *
     * @return the Command as {@link Command}.
     */
    public Command getCommand() {
        return command;
    }



}
