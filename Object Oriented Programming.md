##############################################
#           Object Oriented Programming       #
##############################################

## Concepts:

1. Object  
2. Class  
3. Keywords  
4. Inheritance  
5. Polymorphism  
6. Encapsulation  
7. Abstraction  
8. Concurrency  
9. Persistence  
10. Aggregation


------------------------------------------------
1) OBJECT:
------------------------------------------------

Definition:
-----------
Any real-world entity which has state and behavior is called an **Object**.

- Objects can be physical or virtual.
- Every object has:
    a) State (data)
    b) Behavior (methods/actions)

State:
------
Represents the related information or data(static data) about the object.

Behaviour:
------
object can perform any action is known as Behaviour.



Types of Objects:
-----------------
1. Physical  
2. Virtual


Examples:
---------

1) Bank Account:

   States:
   -------
   - Login / Logout  
   - Open / Close  
   - Active / Deactive  
   - Account Number  
   - Account Holder Name  

   Behavior:
   ---------
   - Making deposit  
   - Withdrawal  
   - Checking balance  
   - Deposit (again — avoid duplication in future notes)


2) Vehicle:

   States:
   -------
   - Chesist No  
   - Vehicle Name
   - Brand,Model
   - Type of Wheel  

   Behavior:
   ---------
   - Braking  
   - Turning  
   - Accelerating
   - Stop
   - gear shifting
   - Speed

-----------------------------------------------------------------------

Q How to create a Object ?

=> syntax :
class object
{
	public static void main(string args[])
	{
		class Name Name_Of_object =new classname();
		objectDemo object1 = new objectDemo();
	}
}

