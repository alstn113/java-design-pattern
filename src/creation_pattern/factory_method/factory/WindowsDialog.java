package creation_pattern.factory_method.factory;

import creation_pattern.factory_method.buttons.Button;
import creation_pattern.factory_method.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}