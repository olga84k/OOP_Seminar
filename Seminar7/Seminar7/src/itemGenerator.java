public abstract class itemGenerator {
    public void openRerward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }
    
    
    public abstract  iGameItem createItem();
}
