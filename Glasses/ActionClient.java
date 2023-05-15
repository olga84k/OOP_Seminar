package Glasses;

public class ActionClient extends Actor{
    private String ActionName;
    private int idActions;
    public ActionClient(String name, String actionname, int id){
        super(name);
        this.ActionName = actionname;
        this.idActions = id;
    }
    @Override
    public String getName() {
        return super.name;
    }
    public int  idActions(int id){
        return idActions;
    }
    public String getActionName(String name){
        return ActionName;
    }

    @Override
    public Actor getActor() {
        return this;
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
    

}
