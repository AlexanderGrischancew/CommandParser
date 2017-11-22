public enum CommandsEnum {

    QUIT_COMMAND("quit","",new ExitCommand()),
    ADD_COMMAND("add","",null),
    GOAL_COMMAND("goal","",null),
    REMOVE_GOAL_COMMAND("remove-goal","",null),
    GOALS_COMMAND("goals","",null),
    RECORD_COMMAND("record","",null),
    STATE_COMMAND("state","",null),
    PROGRESS_COMMAND("progress","",null),
    TOP_COMMAND("top","",null),
    GOALS_WEEK_COMMAND("goals-week","",null),
    NEXT_DAY_COMMAND("next-day","",null),
    SET_DAY_COMMAND("set-day","[0-9]+",null),
    //---
    SLIDING_WINDOW_COMMAND("sliding-window","",null),
    NORMALIZE_COMMAND("normalize","",null),
    PEAKS_COMMAND("peaks","",null),
    PULSE_COMMAND("pulse","",null);

    private final String commandPrefix;
    private final String commandSuffix;
    private final Command command;



    CommandsEnum(String commandPrefix,String commandSuffix, Command command){
        this.commandPrefix = commandPrefix;
        this.commandSuffix = commandSuffix;
        this.command = command;
    }

    public String getCommandPrefix() {
        return commandPrefix;
    }

    public String getCommandSuffix() {
        return commandSuffix;
    }

    public String getCommandRegex() {
        return (commandPrefix+" "+commandSuffix).trim();
    }

    public Command getCommand() {
        return command;
    }

}
