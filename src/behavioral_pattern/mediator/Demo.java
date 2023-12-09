package behavioral_pattern.mediator;

import behavioral_pattern.mediator.components.AddButton;
import behavioral_pattern.mediator.components.DeleteButton;
import behavioral_pattern.mediator.components.Filter;
import behavioral_pattern.mediator.components.List;
import behavioral_pattern.mediator.components.SaveButton;
import behavioral_pattern.mediator.components.TextBox;
import behavioral_pattern.mediator.components.Title;
import behavioral_pattern.mediator.mediator.Editor;
import behavioral_pattern.mediator.mediator.Mediator;
import javax.swing.DefaultListModel;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
