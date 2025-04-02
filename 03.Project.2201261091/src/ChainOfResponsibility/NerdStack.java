package ChainOfResponsibility;

import Decorator.Type;

public class NerdStack extends AssignmentStack{

    @Override
    protected boolean canHandle(Type type) {
        return type == Type.NERD;
    }
}
