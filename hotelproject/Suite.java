
package hotelproject;


public class Suite extends Room {
    
    private int numRoom;
    private boolean hasKitchen;
    
    public Suite(int RoomNumber, double RoomPrice, int NumberOfRooms, boolean HasKitchen) 
    {
        super(RoomNumber, RoomPrice);
        
        numRoom = NumberOfRooms;
        hasKitchen = HasKitchen;
    }
    @Override
    public String getRoomInfo()
    {
        String info = "Suite " + roomNo + "\t$" + price + "\t\t"+ numRoom + " rooms\t\t";
            
            if(hasKitchen)
                return info + "Kitchen" + "\n";
            else
            return info + "No Kitchen" + "\n";
    }
}
