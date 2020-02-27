package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


class User{
	private String username;
	private String password;
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.username.equals(((User)obj).getUsername()))
		return true;
		else
			return false;
	}
	

}

class Message{
	private User user;
	private String message;
	public Message(User user, String message) {
		super();
		this.user = user;
		this.message = message;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Message [user=" + user + ", message=" + message + "]";
	}
}


class ChatRoom{
	private String name;
	private TreeSet<User> listuser;
	private ArrayList<Message> listmsg;
	
	public TreeSet<User> getListuser() {
		return listuser;
	}


	public void setListuser(User u) {
		listuser.add(u);
	}
	

	public ArrayList<Message> getListmsg() {
		return listmsg;
	}


	public void setListmsg(Message message) {
		listmsg.add(message);
	}

	

	public void setListuser(TreeSet<User> listuser) {
		this.listuser = listuser;
	}


	public void setListmsg(ArrayList<Message> listmsg) {
		this.listmsg = listmsg;
	}


	public ChatRoom(String name) {
		this.name = name;
		this.listuser=new TreeSet<User>(new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				// TODO Auto-generated method stub
				return o1.getUsername().compareTo(o2.getUsername());
				
			}
		});
		this.listmsg=new ArrayList<Message>();
	}

	
	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "ChatRoom [name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name.equals(((User)obj).getUsername()))
			return true;
			else
				return false;
	}
	
}


public class Collection6 {
	static HashMap<ChatRoom,TreeSet<User>> userHashMap=new HashMap<ChatRoom,TreeSet<User>>();
	static HashMap<ChatRoom,ArrayList<Message>> messageHashMap=new HashMap<ChatRoom,ArrayList<Message>>();
	static ArrayList<User> userList=new ArrayList<User>();
	static User currentLoggedInUser;
	static ArrayList<ChatRoom> chatList=new ArrayList<ChatRoom>();
	
	public static void addChatRoom(ChatRoom c) {
		chatList.add(c);
	}
	
	public static ChatRoom checkChatRoomExist(String name) {
		Set<ChatRoom> keys = userHashMap.keySet();
        for(ChatRoom key: keys){
            if(key.getname().equals(name))
            {
            	return key;
            }
        }
		
			return null;
	}
	
	public static void addUser(User u) {
		userList.add(u);
	}
	
	public static User checkUserExist(String name) {
		for(int i=0;i<userList.size();i++) {
			if(userList.get(i).getUsername().equals(name)) {
				return userList.get(i);
			}
		}
		return null;
	}
	public static void addUserToChatRoomUserList(User u,String chatRommName)
	{
		Set<ChatRoom> keys = userHashMap.keySet();
        for(ChatRoom key: keys){
            if(key.getname().equals(chatRommName))
            {
            	key.setListuser(u);
            }
            }
	}
	public static  void createChatRoom(ChatRoom c) {
		
		
		userHashMap.put(c,c.getListuser());
		messageHashMap.put(c,c.getListmsg());
	}
	
	public static boolean checkUserExistinAParticularChatRoom(User u,ChatRoom c)
	{
		Iterator<User> iterator = c.getListuser().iterator(); 
        
        while (iterator.hasNext())
        {
            if(u.equals(iterator.next()))
            {
            	return true;
            }
        }
        return false;
	}
	
	public static void deleteUserFromHashMap() {
		Iterator<ChatRoom> itr=userHashMap.keySet().iterator();
		while(itr.hasNext()) {
			Iterator<User> treeSetIterator=userHashMap.get(itr.next()).iterator();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println();
		System.out.println("Options:");
		System.out.println("A) Create a chatroom");
		System.out.println("B) Add the user");
		System.out.println("C) User login");
		System.out.println("D) Send a message");
		System.out.println("E) Display the messages from a specific chatroom");
		System.out.println("F) List down all users belonging to the specified chat room.");
		System.out.println("G) Logout");
		System.out.println("H) Delete an user");
		System.out.println("I) Delete the chat room.");
		System.out.println("J) Exit the application");
		System.out.println("Please enter your option:");
		char n=sc.nextLine().charAt(0);
		switch(n) {
					
		case 'A': 	System.out.println("Enter the name of chatRoom");
					String inputName=sc.nextLine();
					if((checkChatRoomExist(inputName)==null)) {
						ChatRoom chatRoom1=new ChatRoom(inputName);
						createChatRoom(chatRoom1);
						addChatRoom(chatRoom1);
						System.out.print(chatList);
					}
					else {
						System.out.println("Chat room "+inputName+" already exists.");
					}
					break;
		case 'B':	System.out.println("Enter username");
					String userName=sc.nextLine();
					if((checkUserExist(userName)==null)) {
						System.out.println("Enter password");
						String passWord=sc.nextLine();
						System.out.println("Enter the chat room name you want to join");
						String enteredChatRoom=sc.nextLine();
						User newUser=new User(userName,passWord);
						addUser(newUser);
						addUserToChatRoomUserList(newUser,enteredChatRoom);
						System.out.println("User created successfully.");
					}
					else
					{
						System.out.println("User already exist");
					}
					break;
		case 'C':	System.out.println("Enter user name");
					String loginUserName=sc.nextLine();
					User checkUserPassword=checkUserExist(loginUserName);
					if(checkUserPassword!=null)
					{
						System.out.println("Enter password to continue");
						String loginPassword=sc.nextLine();
						if(checkUserPassword.getPassword().equals(loginPassword))
						{
							currentLoggedInUser=checkUserPassword;
							System.out.println("Logged In Succesfully");
						}
						else
						{
							System.out.println("Wrong Password Log In again");
						}
					}
					else
					{
						System.out.println("Username doesnot exist");
					}
					break;
		case 'D':  if(currentLoggedInUser==null)
					{
						System.out.println("Please login first to continue");
					}
					else
					{
						System.out.println("Hi "+currentLoggedInUser.getUsername()+"  Please Enter your chatRoom in which you want to message");
						String sendMessageChatRommName=sc.nextLine();
						ChatRoom curentChatRoomEnteredObject=checkChatRoomExist(sendMessageChatRommName);
						
							if(curentChatRoomEnteredObject!=null)
							{
								if(checkUserExistinAParticularChatRoom(currentLoggedInUser, curentChatRoomEnteredObject))
								{
								System.out.println("Enter your message");
								String enteredMessage=sc.nextLine();
								Message currentUserMessage=new Message(currentLoggedInUser,enteredMessage);
								curentChatRoomEnteredObject.setListmsg(currentUserMessage);
								System.out.println("Message sent Succesfully");
								}	
						
						else
						{
							System.out.println("Sorry you donot belong to this particular chat group first join this chatGroup to continue");
						}
					   }
						else
						{
							System.out.println("Sorry Chat Room doesnot exist");
						}
						
					}
					break;
		case 'E': System.out.println("Enter the chatRoom you want to see the message");
				 	String enteredChatRoom=sc.nextLine();
				 	ChatRoom curentChatRoomEnteredObject=checkChatRoomExist(enteredChatRoom);
				 	if(curentChatRoomEnteredObject!=null)
				 	{
				 		System.out.println(messageHashMap.get(curentChatRoomEnteredObject));
				 	}
				 	else {
				 		System.out.println("Sorry Chat Room does not exist");
				 	}
				 	break;
				 	
		case 'F': System.out.println("Enter the chatRoom you want to see the users of");
				String enteredChatRoomUsers=sc.nextLine();
				ChatRoom curentChatRoomEnteredObjectUsers=checkChatRoomExist(enteredChatRoomUsers);
				if(curentChatRoomEnteredObjectUsers!=null)
				{
					System.out.println(userHashMap.get(curentChatRoomEnteredObjectUsers));
				}
				else {
					System.out.println("Sorry Chat Room doesnot exist");
				}
				break;
				
		case 'G': 	currentLoggedInUser=null;
					System.out.println("User logged out successfully.");
					break;
					
		case 'H':	System.out.println("Enter username");
					String userNameForDeleting=sc.nextLine();
					User toBeDeleted=checkUserExist(userNameForDeleting);
					
					if((toBeDeleted!=null)) {
						System.out.println("Enter password");
						String passWord=sc.nextLine();
						if(toBeDeleted.getPassword().equals(passWord))
						{	userList.remove(toBeDeleted);
							Iterator<ChatRoom> itr=userHashMap.keySet().iterator();
							while(itr.hasNext())
							{	ChatRoom rooms=itr.next();
								TreeSet<User> treeSet1=userHashMap.get(rooms);
								Iterator<User> iterator2=treeSet1.iterator();
								while(iterator2.hasNext())
								{	User userTobeDeleted=iterator2.next();
									if(toBeDeleted.equals(userTobeDeleted))
									{
										treeSet1.remove(userTobeDeleted);
										rooms.setListuser(treeSet1);
									}
								}
							}
							System.out.println("User Deleted Succesfully");
						}
						else
						{
							System.out.println("Wrong Password Log In again");
						}
					}
					else
					{
						System.out.println("user doesnot exist");
					}
					break;
		case 'J':   System.out.println("Thank you for using my application");
					System.exit(0);
					break;
		default :  	System.out.println("Invalid choice");
					break;
				 	
		}
		
	}
	}

}