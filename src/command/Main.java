package command;

public class Main {

    public static void main(String[] args) {
        Content c = new Content();
        Command insertCommand = new InsertCommand(c);
        insertCommand.doit();
        insertCommand.undo();

        Command copyCommand = new CopyCommand(c);
        copyCommand.doit();
        copyCommand.undo();

        Command deleteCommand = new CopyCommand(c);
        deleteCommand.doit();
        deleteCommand.undo();

        System.out.println(c.msg);
    }
}
