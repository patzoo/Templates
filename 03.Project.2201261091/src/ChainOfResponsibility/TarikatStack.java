package ChainOfResponsibility;

import Decorator.Type;

public class TarikatStack extends AssignmentStack{

    @Override
    protected boolean canHandle(Type type) {
        return type == Type.TARIKAT;
    }
}
