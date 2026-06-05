package hw.ch22.command;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class MacroCommand implements Command {
    // 명령의 배열 
    private Deque<Command> commands = new ArrayDeque<>();
    // Undo 시 삭제된 명령 보관 배열
    private Deque<Command> commandsForRedo=new ArrayDeque<>();

    // 실행 
    @Override
    public void execute() {
        Iterator<Command> it=commands.descendingIterator();

        while (it.hasNext()) {
            it.next().execute();
        }   
    }

    // 추가 
    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("infinite loop caused by append");
        }
        commands.push(cmd);
    }

    // 마지막 명령을 삭제
    public void undo() {
        if (!commands.isEmpty()) {
            Command cmd=commands.pop();
            commandsForRedo.push(cmd);
        }
    }

    // 재실행 
    public void redo() {
        if (!commandsForRedo.isEmpty()) {
            Command cmd=commandsForRedo.pop();
            commands.push(cmd);
        }
    }

    // 전부 삭제 
    public void clear() {
        commands.clear();
        commandsForRedo.clear();
    }
}
