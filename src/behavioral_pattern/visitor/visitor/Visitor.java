package behavioral_pattern.visitor.visitor;

import behavioral_pattern.visitor.shapes.Circle;
import behavioral_pattern.visitor.shapes.CompoundShape;
import behavioral_pattern.visitor.shapes.Dot;
import behavioral_pattern.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}