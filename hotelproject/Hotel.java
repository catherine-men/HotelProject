//Catherine Men
//895190874

package hotelproject;

import java.util.ArrayList;
import java.util.Collections;

public class Hotel implements Comparable<Hotel>{
    
    public ArrayList<Room> rooms = new ArrayList<>();
    
    private String name;
    private int stars;
    private double googleRating;
    private double averageRoomPrice;
    
    
    public Hotel(String setName, int setStars)
    {
        name = setName;
        stars = setStars;
    }
    public void setGoogleRating(double GoogleRating)
    {
        googleRating = GoogleRating;
    }
    public void setRoomPrice(double AverageRoomPrice)
    {
        averageRoomPrice = AverageRoomPrice;
    }      
    public String getInfo()
    {
        return String.format("%-10s%8d%8s%,.2f%8.2f", name, stars, "$", getAverageRoomPrice(), googleRating);
        
    }
    public int compareTo(Hotel other)
    {
        if(Double.compare(averageRoomPrice, other.averageRoomPrice) != 0)
            return Double.compare(averageRoomPrice, other.averageRoomPrice);
        
        else if (Integer.compare(stars, other.stars) != 0)
            return -1 * Integer.compare(stars, other.stars);
        
        else
            return -1 * Double.compare(googleRating, other.googleRating);
    } 
    public double getAverageRoomPrice()
    {
            double sum = 0;
            for (Room r: rooms)
                sum += r.price;
            return sum / rooms.size();
    }
    
    public void addRoom(Room r)
    {
        rooms.add(r);
    }
    public void listRooms()
    {
        Collections.sort(rooms);
        for (Room r: rooms)
            System.out.print(r.getRoomInfo());
    }
}
