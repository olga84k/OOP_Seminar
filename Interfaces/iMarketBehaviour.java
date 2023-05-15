package Interfaces;

import java.util.List;
public interface iMarketBehaviour {
void acceptToMarket(iActorBeheviour actor);
void releaseFromMarket(List<iActorBeheviour>actors);
void update();
}
