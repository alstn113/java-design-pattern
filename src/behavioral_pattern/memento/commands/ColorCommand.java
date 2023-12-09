package behavioral_pattern.memento.commands;

import behavioral_pattern.memento.editor.Editor;
import behavioral_pattern.memento.shapes.Shape;
import java.awt.Color;

public class ColorCommand implements Command {
    private final Editor editor;
    private final Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}