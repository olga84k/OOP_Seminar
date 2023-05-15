package Glasses;

import Interfaces.iActorBeheviour;
import Interfaces.iReturnOrder;

public  abstract class Actor implements iActorBeheviour, iReturnOrder{
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    public Actor(String name) {
        this.name = name;
    }
    public  abstract String getName(); 

    
}
