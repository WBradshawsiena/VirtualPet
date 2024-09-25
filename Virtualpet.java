public class VirtualPet{
    public Integer health=100;
    public VirtualPet (){
        String[][] inv= new String[0][1];
        inv[0][0]="1";
        inv[0][1]="Burger";
        Integer happyness=100;
        Integer xp=0;
        Integer hunger=0;
        Integer level = xp/7;
    }
    public void main()
    {
        
    }
    public void feed(String food,String[][] inv)
    {
        for(int i=0;i<inv.length;i++)
        {
            if(inv[i][1]==food)
            {
                if((health+10)>=100)
                    health = 100;
                else
                    health+=10;
            }
        }
    }
    public void addItem(String item, String[][] inv)
    {
        for(int i=0;i<inv.length;i++)
        {
            if(inv[i][1]==item){
                inv[i][0]= inv[i][1]+1;
            }
            else{
                String[][] newinv= new String[inv.length][1];
                newinv[inv.length][1]=item;
                newinv[inv.length][0]="1";
                inv=newinv;
            }
        }
    }
}
