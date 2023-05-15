package Glasses;




public class VipClient extends Actor{
    private int idVip;
    public VipClient(String name, int id){
        super(name);
        this.idVip = id;
    }
    @Override
    public String getName() {
       return super.name;
    }
    public int getVipId(){
      return  idVip;
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
 
    }

