package behavioral_pattern.mediator.components;

import behavioral_pattern.mediator.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);

    String getName();
}
