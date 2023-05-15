package Glasses;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBeheviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iReturnOrder;
public class Market implements iMarketBehaviour, iQueueBehaviour, iReturnOrder {
   private List<iActorBeheviour> queue;

   public Market() {
      this.queue = new ArrayList<iActorBeheviour>();
   }

   @Override
   public void acceptToMarket(iActorBeheviour actor) {
      System.out.println(actor.getActor().getName() + " пришел в магазин");
      this.queue.add(actor);

   }

   @Override
   public void takeInQueue(iActorBeheviour actor) {
      this.queue.add(actor);
      System.out.println(actor.getActor().getName() + " добавлен в очередь");

   }

   @Override
   public void releaseFromMarket(List<iActorBeheviour> actors) {
      for (iActorBeheviour actor : actors) {
         System.out.println(actor.getActor().getName() + " ушел из магазина");
         this.queue.remove(actor);
      }
   }

   @Override
   public void update() {
      takeOrder();
      giveOrder();
      reliseFromQueue();
      CheckObteinOrder();
      ReturnOrder();
   }

   @Override
   public void giveOrder() {
      for (iActorBeheviour actor : queue) {
         if (actor.getActor().isMakeOrder) {
            actor.setTakeOrder(true);
            System.out.println(actor.getActor().getName() + " получил заказ");
         }
      }

   }

   @Override
   public void reliseFromQueue() {
      List<iActorBeheviour> releaseActors = new ArrayList<>();
      for (iActorBeheviour actor : queue) {
         if (actor.getActor().isTakeOrder) {
            releaseActors.add(actor.getActor());
            System.out.println(actor.getActor().getName() + " ушел из очереди");
         }
      }
      releaseFromMarket(releaseActors);

   }

   @Override
   public void takeOrder() {
      for (iActorBeheviour actor : queue) {
         if (!actor.getActor().isMakeOrder) {
            actor.setMakeOrder(true);
            System.out.println(actor.getActor().getName() + " сделал заказ");
         }
      }

   }

   @Override
   public void CheckObteinOrder() {
      for(iActorBeheviour actor : queue){
         if(actor.getActor().isTakeOrder){
         System.out.println(actor.getActor().getName() + "приобрел товар");      
         }
         else{
            System.out.println(actor.getActor().getName() + "не приобретал товар" + "отказать в возврате"); 
         }
      }
      
   }

   @Override
   public void ReturnOrder() {
      for (iActorBeheviour actor : queue) {
         if (actor.getActor().isTakeOrder) {
            actor.setTakeOrder(false);
            System.out.println(actor.getActor().getName() + " вернул товар");
         }
      }
      
   }

   
}
