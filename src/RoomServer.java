//CPSC 441 W2016 Group 31
//Paper Airplanes Messenger
//Brendan Petras, Ethan Hamman, Konrad Wisniewski, Kyle Sutherland

//Imports
import java.util.*;

/**
 *  RoomServer is created when a new chat room is created and it handles
 *  the chat between users in the specific room.  It also tracks which
 *  users are in the chat.
 */
public class RoomServer
{
    private int roomID;
    private int roomType; // 0 = private; 1 = public
    private ArrayList<User> userList = new ArrayList<User>();

    public RoomServer(int roomID,int roomType, User user)
    {
        this.roomID = roomID;
        this.roomType = roomType;
        userList.add(user);
    }

    public void closeRoomServer()
    {

    }

    public byte[] receiveMessage()
    {
      return null;
    }

    public byte[] receiveFile()
    {
        return null;
    }

    public void forwardMessage(byte[] msg)
    {

    }

    public void forwardFile(String filename)
    {

    }
}
