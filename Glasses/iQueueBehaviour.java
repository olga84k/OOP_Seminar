package Glasses;

import Interfaces.iActorBeheviour;

public interface iQueueBehaviour{
        void takeInQueue(iActorBeheviour actor);
        void reliseFromQueue();
        void takeOrder();
        void giveOrder();
    }

