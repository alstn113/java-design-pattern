package creation_pattern.factory_method.factory;

import creation_pattern.factory_method.buttons.Button;
import creation_pattern.factory_method.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
