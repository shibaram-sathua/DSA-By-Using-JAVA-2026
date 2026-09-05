package problemsUnderstandingOOPs;
class HotelRoom{
    private String roomNumber;
    private double price;
    private boolean isOccupied;
    public HotelRoom(String roomNumber,double price){
        this.roomNumber = roomNumber;
        this.price = price;
        this.isOccupied = false;
    }
    public String getRoomNumber(){
        return roomNumber;
    }
    public double getPrice(){
        return price;
    }
    public boolean isOccupied(){
        return isOccupied;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void bookRoom(){
        if(this.isOccupied){
            throw new IllegalStateException("Room already occupied");
        }
        else {
            this.isOccupied = true;
            System.out.println("Room booked successfully");
        }
    }
    public void checkOut(){
        if(this.isOccupied){
            this.isOccupied = false;
            System.out.println("Room checked out successfully");
        }
    }

}
public class HotelRoomBookingEngine {
    public static void main(String[] args){
       HotelRoom rooms = new HotelRoom("Room 101",2500);
       HotelRoom room = new HotelRoom("Room 102", 1800);
        rooms.bookRoom();
//        rooms.bookRoom();
        rooms.checkOut();
        rooms.bookRoom();
        room.bookRoom();
    }
}
