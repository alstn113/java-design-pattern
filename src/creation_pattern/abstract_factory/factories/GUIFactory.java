package creation_pattern.abstract_factory.factories;

import creation_pattern.abstract_factory.buttons.Button;
import creation_pattern.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}