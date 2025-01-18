import java.util.Scanner;

public class Nokia3310{

 public static void main(String[] args){

 Scanner input = new Scanner(System.in);
System.out.print(

"""

Welcome to Nokia
 Enter a number for the following operation:
1. Phone book;
2. Messages;
3. Chat;
4. Call register;
5. Tone;
6. Setting;
7. Call divert;
8. Games;
9. Calculator;
10. Reminders;
11. Clock;
12. Profile;
13. Sim service;

"""
);
 System.out.println("Display: ");
 int phone_book = input.nextInt();
  switch(phone_book){
 case 1:System.out.println("""
1. Search;
2. Service Nos;
3. Add name;
4. Edit;
5. Erase;
6. speed dial;
7. Assign tone;
8. Send b'card;
9. Option;
10. Voice tags;
""");
}
 System.out.println("Display: ");
 int option = input.nextInt();
  switch(option){
 case 9:System.out.println("""

1. Type of view;
2. memory status;
""");
}

 System.out.println("Display: ");
 int message = input.nextInt();
  switch(message){
 case 9:System.out.println("""

1. Write message;
2. Inbox;
3. Outbox;
4. Picture messages;
5. Templates;
6. Smileys;
7. Message settings;
8. Info service;
9. Voice mailbox number;
10. Service command editor;
""");
}

 System.out.println("Display: ");
 int message_setting = input.nextInt();
  switch(message_setting){
  case 7:System.out.println("""

1. Set;
2. Common;
""");
}
 System.out.println("Display: ");
 int set = input.nextInt();
  switch(set){
 case 1:System.out.println("""
1. Message centre number;
2. Message sent as;
3. Message validity;
""");
}
 System.out.println("Display: ");
 int common = input.nextInt();
  switch(common){
 case 2:System.out.println("""
1. Delivery reports;
2. Reply via same centre;
3. Character support;
""");
}

System.out.println("Display: ");
 int call_register = input.nextInt();
  switch(call_register){
 case 4:System.out.println("""
1. Missed calls;
2. Received calls;
3. Dialled numbers;
4. Erase recent call lists;
5. Show call duration;
""");
}

System.out.println("Display: ");
 int Showcallduration = input.nextInt();
  switch(Showcallduration){
 case 5:System.out.println("""
1. Last call duration;
2. All calls duration;
3.Received calls duraton;
4. Dialled call duration;
5. Cleartimes;
""");
}

System.out.println("Display: ");
  int show_call_costs = input.nextInt();
  switch(show_call_costs){
 case 6:System.out.println("""
1. Last call cost;
2. All calls cost;
3. Clear counters;
""");
  }

System.out.println("Display: ");
 int call_cost_setting = input.nextInt();
  switch(call_cost_setting){
 case 7:System.out.println("""
1. Call cost setting;
2. Show cost in
""");
}
System.out.println("Display: ");
 int Tones = input.nextInt();
  switch(Tones){
 case 5:System.out.println("""
1. Ringing tone;
2. Ringing volume;
3. Incoming call alert;
4. Composer;
5. Message alert tone;
6. Keypad tone
7. Warning and games tone;
8. Vibrating alert;
9. Screen saver;
""");
}
System.out.println("Display: ");
 int setting = input.nextInt();
  switch(setting){
 case 6:System.out.println("""
1. Call setting;
2. phone Setting;
3. Security setting;
4. Restore factory settings;
""");
}

System.out.println("Display: ");
 int callsetting= input.nextInt();
  switch(callsetting){
 case 1:System.out.println("""
1. Automatic redail;
2. Speed dailing;
3. Call waiting options;
4 own number sending;
5. Phone line in use;
6. Automatic answer;
""");
}
System.out.println("Display: ");
 int phonesetting = input.nextInt();
  switch(phonesetting){
 case 2:System.out.println("""
1. language;
2. cell info display;
3. Welcome note;
4. Network selection;
5. Lights;
6. Confirm SIM service actions;
""");
}
System.out.println("Display: ");
 int securitysetting = input.nextInt();
  switch(securitysetting){
 case 3:System.out.println("""
1. PIN code request;
2. Call barring service;
3. Fixed dialling;
4. Closed user group;
5. Phone security;
6. Change access codes;
""");
}

System.out.println("Display: ");
 int clock = input.nextInt();
  switch(clock){
 case 11:System.out.println("""
1. Alarm;
2. Clock settings;
3. Date setting;
4. Stop watch;
5. Countdown timer;
6. Auto update of date and time;
""");
}






}




}