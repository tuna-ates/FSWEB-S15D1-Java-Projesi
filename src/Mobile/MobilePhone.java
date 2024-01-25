package Mobile;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MobilePhone {
       private String myNumber;
       private ArrayList<Contact> contacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.contacts=new ArrayList<>();
  }

  public boolean addNewContact(Contact contact){
    if (contact==null||contact.getName()==null||contact.getPhoneNumber()==null){
      return false;
    }
    if (findContact(contact.getName())>=0){
        return false;
    }
    this.contacts.add(contact);
    return true;
  }

  public boolean updateContact(Contact oldContact,Contact newContact){

    //int oldContactIndex=findContact(oldContact);

    if (findContact(oldContact)<0){
      return false;
    }
    /*oldContact.setName(newContact.getName());
    oldContact.setPhoneNumber(newContact.getPhoneNumber());
    return true;*/

     contacts.set(findContact(oldContact),newContact);
     return  true;

  }

  public boolean removeContact(Contact contact){
    if (findContact(contact)<0){
      return false;
    }
    this.contacts.remove(findContact(contact));
    return true;
  }

  public Contact queryContact(String name){
    if (findContact(name)<0){
      return null;
    }
   return contacts.get(findContact(name));
  }

  public void  printContact(){
    for (int i=1;i<=contacts.size();i++){
      System.out.println(i+"."+" "+contacts.get(i).getName()+"-> "+contacts.get(i).getPhoneNumber());
    }
  }





  public int findContact(String name){
    for (int i=0;i<contacts.size();i++){
      if (contacts.get(i).getName().equalsIgnoreCase(name)){
        return i;
      }
    }
    return -1;
  }

  public int findContact(Contact contact){
   return this.contacts.indexOf(contact);
  }
}
