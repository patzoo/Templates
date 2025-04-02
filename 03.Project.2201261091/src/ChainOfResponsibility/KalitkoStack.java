package ChainOfResponsibility;

import Decorator.Type;

public class KalitkoStack extends AssignmentStack{

    @Override
    protected boolean canHandle(Type type) {
        return type == Type.KALITKO;
    }
}
