package worldOfZuul;

public enum Commands
{
    GO("go"),
    HELP("help"),
    UNKNOWN("?"),
    CHANGENAME("changename"),
    STATS("stats"),
    COLLECTFOOD ("collectfood"),
    QUIT("quit"),
    INVENTORY("inventory"),
    EAT("eat");
    
    private String commandName;
    
    Commands(String commandString)
    {
        this.commandName = commandString;
    }
    
    public String toString()
    {
        return commandName;
    }
}
