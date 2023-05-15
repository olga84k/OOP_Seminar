package Supermarket.Glasses;

import Glasses.ActionClient;
import Glasses.Market;
import Glasses.OrdinaryClient;
import Glasses.VipClient;
import Interfaces.iActorBeheviour;

public class Seminar2 {
   public static void main(String[] args) throws Exception {
    Market market = new Market();
    iActorBeheviour item1 = new OrdinaryClient("Boris");
    iActorBeheviour item2 = new OrdinaryClient("Lena");
    iActorBeheviour item4 = new ActionClient("Gala", "2 по цене 1", 1);
    market.acceptToMarket(item1);
    market.acceptToMarket(item2);
    iActorBeheviour item3 = new VipClient("Olga", 123);
    market.acceptToMarket(item3);
    market.acceptToMarket(item4);
    market.update();
}
}
