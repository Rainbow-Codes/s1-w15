import java.util.*;
// Represent a person's name with three components, a first name,
// a middle name, and a last name.

public class Friends {

   ArrayList<Name> friends = new ArrayList<>();
   Random r = new Random();
   
   // the constructor
   public Friends () {
       friends.add(new Name("Jeff", "Libman"));
       friends.add(new Name("Sean", "Morris"));
       friends.add(new Name("Andy","Rothstein"));
   }
   
   public Name getRandomFriend(){
       return friends.get(r.nextInt(friends.size()));
    }
   
  
}