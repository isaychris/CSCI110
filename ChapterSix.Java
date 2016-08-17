class ChapterSix{
    public int numberInRooms = 0; //starting value
    private static int totalNumber = 0; //starting value
         
public void addPersonToRoom(int i) {
	numberInRooms += i; //i added to room
	totalNumber += i; //totalnumber updated
}

public void removePersonFromRoom(int i) {
	numberInRooms -= i; //i removed from room
	totalNumber -= i; //totalnumber updated
}

public static int getTotal() {
	return totalNumber; //total
}
public int getNumber(){
    return numberInRooms; 
}

public static void main(String[] args){ 
	ChapterSix room1 = new ChapterSix(); //instance for room1
    ChapterSix room2 = new ChapterSix(); //instance for room2
	ChapterSix room3 = new ChapterSix(); //instance for room3

    room1.addPersonToRoom(2); //add 2 to room1
    room2.addPersonToRoom(3); //add 3 to room 2
	room3.addPersonToRoom(4); //add 4 to room 3
	room1.removePersonFromRoom(1); //remove 1 from room 1
	room1.addPersonToRoom(5); //add 5 to room 1
	room2.addPersonToRoom(3); //add 3 to room 2
	room2.removePersonFromRoom(6); //remove 6 from room 2
	room3.addPersonToRoom(2); //add 2 to room 3
	
	System.out.println("------------------------------------------");
    System.out.println("//Chapter Six Assignment//");       
	System.out.println("//Room Occupancy//");            
    System.out.println("------------------------------------------");
    System.out.println("[Output]");
    System.out.println(" ");        
	
    System.out.println("Number of people in Room1: " + room1.getNumber());
    System.out.println("Number of people in Room2: " + room2.getNumber());
    System.out.println("Number of people in Room3: " + room3.getNumber());
    System.out.println(" ");        
    System.out.println("Total number of people in the building: " + ChapterSix.getTotal());
    }
}

