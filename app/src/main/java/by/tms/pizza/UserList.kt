package by.tms.pizza

class UserList {
    val listOfUsers= ArrayList<User>()
     companion object{
         val instance = UserList()
     }
}