package Glasses;



public class OrdinaryClient extends Actor{

    public OrdinaryClient(String name) {
        super(name);

    }
 
    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
       
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
        
    }

    @Override
    public void setTakeOrder(boolean picUpOrder) {
        super.isTakeOrder = picUpOrder;
        
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public void CheckObteinOrder() {
            
         }
         
    @Override
    public void ReturnOrder() {
            
         }
         
      }
        
    

    

