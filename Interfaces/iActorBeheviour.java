package Interfaces;

import Glasses.Actor;

public interface iActorBeheviour {
void setMakeOrder(boolean makeOrder);
void setTakeOrder(boolean picUpOrder);
boolean isMakeOrder();
boolean isTakeOrder();
 Actor getActor();   
}