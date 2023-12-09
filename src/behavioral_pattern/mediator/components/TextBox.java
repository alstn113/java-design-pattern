package behavioral_pattern.mediator.components;

import behavioral_pattern.mediator.mediator.Mediator;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

/**
 * Concrete components don't talk with each other. They have only one communication channel–sending requests to the
 * mediator.
 */
public class TextBox extends JTextArea implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
