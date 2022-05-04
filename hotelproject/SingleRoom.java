//Catherine Men
//895190874

package hotelproject;

public class SingleRoom extends Room {
    
    private String bedType;
    private boolean smoking;
    
    public SingleRoom(int RoomNumber, double RoomPrice, String BedType, Boolean Smoking) 
    {
        super(RoomNumber, RoomPrice);
        bedType = BedType;
        smoking = Smoking;
    }
        @Override
        public String getRoomInfo()
        {
            String info = "Room " + roomNo + "\t$" + price + "\t\t"+ bedType + "\t\t";
            
            if(smoking)
                return info + "Smoking" + "\n";
            else
            return info + "No Smoking" + "\n";
        }
}
